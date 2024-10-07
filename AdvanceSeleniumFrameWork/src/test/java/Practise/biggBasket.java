package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class biggBasket {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		String name = "Patna Pirates";
		List<WebElement> list = driver.findElements(By.xpath("//p[text()='"+name+"']/ancestor::div[@class='row-head']/descendant::ul/li"));
		for (WebElement l1 : list) {
			System.out.println(l1.getText());
			
		}

	}

}
