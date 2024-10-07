package Generic_utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectRepository.vtigerHomePage;
import ObjectRepository.vtigerLoginPage;


public class BaseClass {
	public WebDriver driver;
	public static WebDriver sdriver;//for the listener & parallel execution as driver have to focus to take ss
	
	
	@BeforeSuite(groups = {"smokeTest","regressionTest","sanityTest"})
	public void BS() {
	
		System.out.println("Database conn open");
	}
	
	
	@BeforeTest(groups = {"smokeTest","regressionTest","sanityTest"})
	public void BT() {
		System.out.println("Parllel execution");
	}
	
	
	
	//@Parameters("BROWSER")---> for xml suit
	@BeforeClass(groups = {"smokeTest","regressionTest","sanityTest"})
	//public void BC(String BROWSER) throws Throwable {---> for xml suit
	public void BC() throws Throwable {
		
		//reading from file_Utility
		
				File_utility fil = new File_utility();
				String BROWSER = fil.getKeyandValuePair("Browser");
				
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
				
		System.out.println("Launching browser");
		sdriver = driver;
	}
	
	
	//@Parameters({"URL","USERNAME","PASSWORD"})
	@BeforeMethod(groups = {"smokeTest","regressionTest","sanityTest"})
	//public void BM(String URL, String USERNAME, String PASSWORD) throws Throwable {
		public void BM() throws Throwable {
		File_utility fil = new File_utility();
		
		//reading from property file
//		String URL = fil.getKeyandValuePair("url");
//		
//		String USERNAME = fil.getKeyandValuePair("username");
//		String PASSWORD = fil.getKeyandValuePair("password");
		
		
		//reading from command prompt for maven execution
		String URL = System.getProperty("url");
		
		String USERNAME = System.getProperty("username");
		String PASSWORD =  System.getProperty("password");
		
		driver.get(URL);
		
		
		vtigerLoginPage login = new vtigerLoginPage(driver);
		login.loginToVitger(USERNAME,PASSWORD);
		
		System.out.println("Login To App");
	}
	
	
	
	@AfterMethod(groups = {"smokeTest","regressionTest","sanityTest"})
	public void AM() {
		vtigerHomePage homepage = new vtigerHomePage(driver);
		homepage.ClickOnSignOut();
		System.out.println("Logout app");
	}
	
	
	
	
	@AfterClass(groups = {"smokeTest","regressionTest","sanityTest"})
	public void AC() {
		driver.quit();
		System.out.println("close browser");
	}
	
	
	@AfterTest(groups = {"smokeTest","regressionTest","sanityTest"})
	public void AT() {
		System.out.println("Parallel execution");
	}
	
	
	@AfterSuite(groups = {"smokeTest","regressionTest","sanityTest"})
	public void AS() {
		System.out.println("Database conn close");
	}
	
	

}
