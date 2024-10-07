//package TestNg;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//import Generic_utility.BaseClass;
//import Generic_utility.Excel_utility;
//
//public class DataProviderEx3Test extends BaseClass {
//	
//	@Test
//	public void organizationModuleTest(String orgName, String phnNum, String mailId) throws Throwable {
//	/*	WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://localhost:8888/");
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();*/
//		
//		driver.findElement(By.linkText("Organizations")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("accountname")).sendKeys(orgName);
//		driver.findElement(By.id("phone")).sendKeys(phnNum);
//		driver.findElement(By.id("email1")).sendKeys(mailId);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		driver.findElement(By.linkText("Sign Out")).click();
//		driver.quit();
//	}
//	
//	public Object[][] readData() throws Throwable {
//		Excel_utility elib = new Excel_utility();
//		Object[][] value = elib.getDataProviderData("DataProvider");
//		return value;
//	}
//
//}
