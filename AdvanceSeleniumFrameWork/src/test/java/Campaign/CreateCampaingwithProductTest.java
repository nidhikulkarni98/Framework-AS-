package Campaign;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_utility;
import Generic_utility.Java_utility;
import Generic_utility.Webdriver_utility;
import ObjectRepository.CreateCampaingPage;
import ObjectRepository.ProductPage;
import ObjectRepository.vtigerHomePage;
import ObjectRepository.vtigerLoginPage;

@Test(groups = "sanityTest")
public class CreateCampaingwithProductTest extends BaseClass {

	public void createCampaingwithProductTest()  throws Throwable {

		/*//login to v-tiger application
		
		//reading from file_Utility
				File_utility fil = new File_utility();
				String BROWSER = fil.getKeyandValuePair("Browser");
				String URL = fil.getKeyandValuePair("url");
				String USERNAME = fil.getKeyandValuePair("username");
				String PASSWORD = fil.getKeyandValuePair("password");
		
		WebDriver driver;
		
		//checking what key's value is, so accordingly that browser will launch
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		driver.get(URL);
		
		
		//Business Logic
		driver.get(URL);
		vtigerLoginPage login = new vtigerLoginPage(driver);
		login.loginToVitger(USERNAME,PASSWORD);*/
		
		
		//..................................create product.............................................//		
		

		//to click on product link
			
			//Using Business Logiv
				vtigerHomePage homePage = new vtigerHomePage(driver);
				homePage.getPRODUCTS().click();
			
		//to click on create product
			
			ProductPage prdpage = new ProductPage(driver);
			prdpage.CreateProduct();
		
	
	//to read the product name from excel
			
			//using the Java Utility class created to random number
			Java_utility jutil = new Java_utility();
			int ranNum = jutil.returnRandomNumber();
			
			
			//reading from Excel utility
			
			Excel_utility elib = new Excel_utility();
			String prodata = elib.getExcelData("Product", 0, 0)+ranNum;
			System.out.println(prodata);
				
			prdpage.clickonPrdNAme(prodata);
		
			//to click on save button
			
		prdpage.clickOnsavebutton();
		
//..................................create campaing.............................................//		
		//to mouse hover on more
				
		vtigerHomePage homepage1 = new vtigerHomePage(driver);
		homepage1.clickOnMore(driver);
			
			//to click on campaign

			
				
			//to click on create
				CreateCampaingPage createcamp = new	CreateCampaingPage(driver);
				createcamp.getCampaingLook();
				
			//to read the data from excel
				
				
				//using the Java Utility class created to random number
				Java_utility jutil1 = new Java_utility();
				int ranNum1 = jutil.returnRandomNumber();
				
				
	
				
				//reading from Excel utility
				
				Excel_utility elib1 = new Excel_utility();
				String CampData = elib1.getExcelData("Campaing", 0, 0)+ranNum1;
				System.out.println(CampData);
				
				
			
				createcamp.getCampaingName(CampData);
				
//..................................click on plus sign and handle popup.............................................//
				//to click on product plus sign
		
				Thread.sleep(2000);
				prdpage.clickonProductPlusSign();
	
				
				
				//window switching
				
				Webdriver_utility wlib = new Webdriver_utility();
				wlib.switchWindow(driver, "Products&action");
				

				//driver.findElement(By.name("search_text")).sendKeys(prodata);
				//driver.findElement(By.name("search")).click();
				prdpage.clickOnSearchText(prodata);
				prdpage.clickonSearch();

				// driver.findElement(By.xpath("//a[text()='Iphone61']")).click();//since the product we added migh change so dynamic

				Thread.sleep(2000);
				// dynamic xapth
				//driver.findElement(By.xpath("//a[text()='" + prodata + "']")).click();
				prdpage.DynamicProductSearch(driver, prodata);
				
// ----+-----------------------------------------------------------------------------------------------
				// driver switching back to main win
				
				
				Webdriver_utility wlib1 = new Webdriver_utility();
				wlib1.switchWindow(driver, "Campaigns&action");
				
				//driver.findElement(By.cssSelector("[title=\"Save [Alt+S]\"]")).click();
				prdpage.clickOnsavebutton();
				
				/*vtigerHomePage homepage = new vtigerHomePage(driver);
				homepage.ClickOnSignOut();*/
				


	}

}
