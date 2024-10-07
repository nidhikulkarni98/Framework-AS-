package Campaign;

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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_utility;
import Generic_utility.Java_utility;
import Generic_utility.Webdriver_utility;
import ObjectRepository.CreateCampaingPage;
import ObjectRepository.ProductPage;
import ObjectRepository.validationPage;
import ObjectRepository.vtigerHomePage;
import ObjectRepository.vtigerLoginPage;

//@Listeners(Generic_utility.ListenerImplimentation.class)
@Listeners(Generic_utility.ExtentReportImp.class)
public class createCampaignTest extends BaseClass{

	//@Test(retryAnalyzer =Generic_utility.retryanalyserimp.class)
	@Test
	public void createCampaignTest() throws Throwable {
		
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
		
		
		//using business login
		driver.get(URL);
		vtigerLoginPage login = new vtigerLoginPage(driver);
		login.loginToVitger(USERNAME,PASSWORD);*/
		
		
		
		
	//to mouse hover on more
		
		vtigerHomePage homepage = new vtigerHomePage(driver);
		homepage.clickOnMore(driver);
		
		
	//to click on campaings
		
	//to click on create
		
		CreateCampaingPage createCamp = new CreateCampaingPage(driver);
		createCamp.getCampaingLook();
		
	//to read the data from excel

		
		//using the Java Utility class created to random number
		Java_utility jutil = new Java_utility();
		int ranNum = jutil.returnRandomNumber();
	
		
	//reading from Excel utility
		
		Excel_utility elib = new Excel_utility();
		String CampData = elib.getExcelData("Campaing", 0, 0)+ranNum;
		System.out.println(CampData);
		
		
		
		createCamp.getCampaingName(CampData);
		
		//Assert.fail("Assert fails");
		
	//to click on save
		//driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		ProductPage prdpage = new ProductPage(driver);
		prdpage.clickOnsavebutton();
		
		
	//to varify

		
		validationPage validation = new validationPage(driver);
		validation.CampaignPage(driver, CampData);
		
		//logout from application
		

		/*homepage.ClickOnSignOut();*/
		

	}

}
