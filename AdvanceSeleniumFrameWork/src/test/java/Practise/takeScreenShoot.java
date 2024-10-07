package Practise;

import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreenShoot {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	   WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
	   search.sendKeys("Java and selenium");
	   search.sendKeys(Keys.ENTER);
	   driver.findElement(By.xpath("//span[contains(@title,'Selenium with Java (')]")).click();
	   Thread.sleep(1000);
	   TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./youtube.png");
	    FileUtils.copyFile(src, dest);
		
	}

}
