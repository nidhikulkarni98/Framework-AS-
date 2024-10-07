package Organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_utility;
import Generic_utility.Java_utility;
import ObjectRepository.CreateOrganizationPage;
import ObjectRepository.ProductPage;
import ObjectRepository.validationPage;
import ObjectRepository.vtigerHomePage;
import ObjectRepository.vtigerLoginPage;

class CreateOrganizationTest extends BaseClass {
	
	@Test(groups = "regressionTest")
	public void createOrganizationTest()  throws Throwable {
		
		
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
	
		
		//using business login
				driver.get(URL);
				vtigerLoginPage login = new vtigerLoginPage(driver);
				login.loginToVitger(USERNAME,PASSWORD);*/
		
		//clicking on organization button
				//driver.findElement(By.linkText("Organizations")).click();
				vtigerHomePage homePage = new vtigerHomePage(driver);
				homePage.clickOnOrganization();
				
		//to click on create lookup img
				//driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
				CreateOrganizationPage createtorgpage = new CreateOrganizationPage(driver);
				createtorgpage.clickOnOrgLookUpImg();
				
		//to enter phonenumber,name,email--not to hardcore but to read from XML
				
		//to read org name , will make us of random class cause its madatory field and wont accept duplicate 
				
				/*Random ran = new Random();
				int ranNum = ran.nextInt(1000);*/
				
				//using the Java Utility class created to random number
				Java_utility jutil = new Java_utility();
				int ranNum = jutil.returnRandomNumber();
				
				
				//reading from Excel utility
				
				Excel_utility elib = new Excel_utility();
				String OrgData = elib.getExcelData("Organization", 0, 0)+ranNum;
				System.out.println(OrgData);
				//driver.findElement(By.name("accountname")).sendKeys(OrgData);
				createtorgpage.clickonAccountNAme(OrgData);
				
				
		//to read phone number
				
//reading from Excel utility
				
				Excel_utility elib1 = new Excel_utility();
				String phData = elib1.getExcelDatausingDataFormatter("Organization", 1, 0);
				System.out.println(phData);
				//driver.findElement(By.id("phone")).sendKeys(phData);
				createtorgpage.ClickonPhoneNumber(phData);
				
		//to read email
				
				Excel_utility elib2 = new Excel_utility();
				String edata = elib2.getExcelDatausingDataFormatter("Organization", 2, 0);
				System.out.println(edata);
	
				createtorgpage.clickonEmail(edata);
				
				//clicking on save

				ProductPage prdpage = new ProductPage(driver);
				prdpage.clickOnsavebutton();

				
				Thread.sleep(3000);
			//varifying if org name is created
				
				validationPage valpage = new validationPage(driver);
				valpage.orgPageNameValidation(driver, OrgData);
				
				//logout from application
	
			/*vtigerHomePage homepage = new vtigerHomePage(driver);
				homepage.ClickOnSignOut();*/
				
				
				
	}

}
