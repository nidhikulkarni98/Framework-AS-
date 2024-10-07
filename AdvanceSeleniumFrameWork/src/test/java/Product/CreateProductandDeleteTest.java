package Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Generic_utility.BaseClass;
import Generic_utility.Excel_utility;
import Generic_utility.File_utility;
import Generic_utility.Java_utility;
import ObjectRepository.ProductPage;
import ObjectRepository.deleteProduct;
import ObjectRepository.validationPage;
import ObjectRepository.vtigerHomePage;
import ObjectRepository.vtigerLoginPage;


@Test(groups = "sanityTest")
public class CreateProductandDeleteTest extends BaseClass {

	public void createProductandDeleteTest() throws Throwable {
		
		//reading from file_Utility
		/*8File_utility fil = new File_utility();
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
		
	//.................................another way.........................//		
//		//to click on product link
//			driver.findElement(By.linkText("Products")).click();
//			
//		//to check the product to delete
//			driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(data);
//			WebElement dropdown = driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@name='search_field']"));
//			Select select = new Select(dropdown);
//			select.selectByValue("productname");
//			driver.findElement(By.name("submit")).click();
//			
//			Thread.sleep(3000);
//			
//		//to click on checkbox and delete
//			driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
//		//to click on checkbox
//			//driver.findElement(By.xpath("//input[@name='selected_id']")).click();
//			driver.findElement(By.linkText("del")).click();
//			
//			Thread.sleep(2000);
//		//to handle alert box
//			Alert alt = driver.switchTo().alert();
//			alt.accept();
	//.........................another way.................................//	
	    
			//.........................mam way.................................//	
			
			//to click on product link
			//driver.findElement(By.linkText("Products")).click();
			homepage.clickOnproducts();
			
			

				
			//Dynamic Xpath
			Thread.sleep(2000);			
			//Dynamic Xpath

			deleteProduct delprd = new deleteProduct(driver);
			delprd.PathToDeleteProduct(driver, prodata);
			
			delprd.clickOnDeleteButton();

Thread.sleep(2000);

driver.switchTo().alert().accept();

Thread.sleep(3000);

//varifying is product is deleted
valpage.DeleteProductValidation(driver, prodata);

Thread.sleep(2000);
//click on signout
//homepage.ClickOnSignOut();

			
			
	}

}
