package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	//Initialzation 
		public ProductPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//Declaration
		@FindBy(css = "img[title='Create Product...']")
		private WebElement CreateProduct;
		
		@FindBy(xpath = "//input[@name='productname']")
		private WebElement prdNAme;
		
		@FindBy(xpath = "//input[@title='Save [Alt+S]']")
		private WebElement savebutton;
		
		@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']")
		private WebElement productPlusSign;
		
		@FindBy(name = "search_text")
		private WebElement SearchText;
		
		@FindBy(name = "search")
		private WebElement search;
		
	//Business Logic
		public void CreateProduct() {
			CreateProduct.click();
		}
		
		public void clickonPrdNAme(String prodata) {
			prdNAme.sendKeys(prodata);
			
		}
		
		public void clickOnsavebutton() {
			savebutton.click();
		}
		
		public void clickonProductPlusSign() {
			productPlusSign.click();
		}
		
		public void clickOnSearchText(String prodata) {
			SearchText.sendKeys(prodata);
		}
		
		public void clickonSearch() {
			search.click();
		}
		
		public void DynamicProductSearch(WebDriver driver, String prodata) {
			driver.findElement(By.xpath("//a[text()='" + prodata + "']")).click();
		}

}
