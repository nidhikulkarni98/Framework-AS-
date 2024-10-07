package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deleteProduct {
	
	//Initialzation 
		public deleteProduct(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@value='Delete']")
		private WebElement DeleteProductButton;
		
		public void PathToDeleteProduct(WebDriver driver ,String prodata) {
			driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr//td//a[text()='"+prodata+"']/../preceding-sibling::td//input[@type='checkbox']")).click();
		}
		
		public void clickOnDeleteButton() {
			DeleteProductButton.click();
		}

}
