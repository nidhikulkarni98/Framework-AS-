package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Generic_utility.Webdriver_utility;

public class spicejet {

	public static void main(String[] args) throws Throwable {
		
		
ChromeOptions opt = new ChromeOptions();//through this we can only dissable 
opt.addArguments("--disable-notifications");
		
		
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.spicejet.com/");
		
		Webdriver_utility wlib = new Webdriver_utility();
		wlib.pageToLoad(driver);
		
		driver.findElement(By.xpath("//div[text()='one way']")).click();
		
		WebElement search = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[1]"));
		search.sendKeys("Goa");
		
		
		List<WebElement> allsug = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-1srvcxg']"));
		for (WebElement sug : allsug) {
			
			String text = sug.getText();
			System.out.println(text);
			if(text.contains("Goa International")) {
				sug.click();
				break;
			}
			
		}
		
		
		WebElement destination = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[2]"));
		destination.sendKeys("Bengaluru");
		List<WebElement> allsug1 = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-1srvcxg']"));
		for (WebElement sug : allsug1) {
			
			String text = sug.getText();
			//System.out.println(text);
			if(text.contains("kemgegowda International")) {
				sug.click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Departure Date']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='September ' and text()='2024']/ancestor::div[@class='css-1dbjc4n r-150rngu r-18u37iz r-16y2uox r-1wbh5a2 r-lltvgl r-buy8e9 r-1sncvnh']"));
		
		   //JavascriptExecutor js = (JavascriptExecutor)driver;
//		    js.executeScript("window.scrollBy(267,806)");
//		    http://ele.click();
			
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView()",ele);
			 ele.click();
			 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='September ' and text()='2024']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[text()='18']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Return Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='October ' and text()='2024']/ancestor::div[@class='css-1dbjc4n r-1mdbw0j r-ymttw5 r-b2dl2 r-mzjzbw r-wk8lta r-tvv088']/descendant::div[text()='10']")).click();
		
		driver.findElement(By.xpath("//div[text()='Passengers']/ancestor::div[@data-testid='home-page-travellers']/descendant::div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		
		

	}

}
