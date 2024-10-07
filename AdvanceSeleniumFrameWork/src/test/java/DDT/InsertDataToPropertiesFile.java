package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable {
		
		//inserting data to property file
		Properties pro1 = new Properties();
		pro1.setProperty("Browser", "chrome");
		pro1.setProperty("url", "http://localhost:8888");
		pro1.setProperty("username", "admin");
		pro1.setProperty("password", "admin");
		FileOutputStream fos = new FileOutputStream("E:\\nidhi\\Documents\\CommonData.properties");
		pro1.store(fos, "CommonData");
		
//............................................................................//
		
		//reading data from property file
		FileInputStream fis = new FileInputStream("E:\\nidhi\\Documents\\CommonData.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String BROWSER = pro.getProperty("Browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
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
		driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(USERNAME);
		driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys(PASSWORD);
		driver.findElement(By.cssSelector("input[id='submitButton']")).click();
		
	}

}
