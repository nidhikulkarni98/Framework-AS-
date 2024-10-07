package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.Webdriver_utility;

public class vtigerHomePage {
	
	//Initialzation 
		public vtigerHomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	
	//declaration
	@FindBy(xpath ="//a[text()='Products']")
	private WebElement PRODUCTS;
	
	@FindBy(xpath = "//a[text()='More']")
	private WebElement MORE;
	
	@FindBy(css = "[name='Campaigns']")
	private WebElement CAMPAIGNS;
	
	@FindBy(xpath = "//img[@src=\"themes/softed/images/user.PNG\"]")
	private WebElement Signout;
	
	@FindBy(linkText = "Sign Out")
	private WebElement SignOutClick;
	
	@FindBy(linkText = "Organizations")
	private WebElement OrganizationButton;
	
	
	public WebElement getPRODUCTS() {
		return PRODUCTS;
	}



	public WebElement getMORE() {
		return MORE;
	}



	public WebElement getCAMPAIGNS() {
		return CAMPAIGNS;
	}
	
	public WebElement getOrganization() {
		return OrganizationButton;
	}



	//business logic for clicking on more and campaign
	public void clickOnMore(WebDriver driver) {
		
		Webdriver_utility wlib = new Webdriver_utility();//since we have written mouse hover in webdriver so calling that
		wlib.mouseMoveToElement(driver, MORE);
		CAMPAIGNS.click();
	
	
	}
	
	public void clickOnMore1() {
		CAMPAIGNS.click();
	}
	
	
	public void clickOnproducts() {
		PRODUCTS.click();
	}
	
	public void ClickOnSignOut() {
		Signout.click();
		SignOutClick.click();
	}
	
	public void clickOnCampaign() {
		CAMPAIGNS.click();
	}
	
	public void clickOnOrganization() {
		OrganizationButton.click();
	}

}
