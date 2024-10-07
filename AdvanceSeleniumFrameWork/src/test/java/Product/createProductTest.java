package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_utility;
import Generic_utility.Java_utility;
import ObjectRepository.vtigerHomePage;
import ObjectRepository.vtigerLoginPage;
import ObjectRepository.ProductPage;
import ObjectRepository.validationPage;



public class createProductTest extends BaseClass {

	@Test(groups = "smokeTest")
	public void createProductTest() throws Throwable {
		
		/*//reading from file_Utility
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
		
		//reading from pom
				vtigerLoginPage vlogin = new vtigerLoginPage(driver);
				vlogin.loginToVitger(USERNAME, PASSWORD);*/
				
		

		//to click on product link
		
				vtigerHomePage homepage = new vtigerHomePage(driver);
				homepage.clickOnproducts();
			
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
			
		//to varify the name
			
			validationPage valpage = new validationPage(driver);
			valpage.productPageValidation(driver, prodata);
			
			//logout from application
			
			/*homepage.ClickOnSignOut();*/
			
	}

}
