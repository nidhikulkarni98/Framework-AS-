package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaingPage {
	
	

		//Initialzation 
		public CreateCampaingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//input[@name='campaignname']")
		private WebElement CampaingNameBox;
		
		@FindBy(xpath="//img[@alt='Create Campaign...']")
		private WebElement CreateCampaingLookUp;
		
		public WebElement getCampaingNameBox() {
			return CampaingNameBox;
		}

		public WebElement getCreateCampaingLookUp() {
			return CreateCampaingLookUp;
		}
		
		public void getCampaingLook() {
			CreateCampaingLookUp.click();
		}
		
		public void getCampaingName(String CampData) {
			CampaingNameBox.sendKeys(CampData);
		}
		
		
		
		
		
		

}
