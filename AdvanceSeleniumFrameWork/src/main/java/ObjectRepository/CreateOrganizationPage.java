package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {
	
	//Initialzation 
			public CreateOrganizationPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
	
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement orgLookUoImg;
	
	@FindBy(name = "accountname")
	private WebElement Accountname;
	
	@FindBy(id = "phone")
	private WebElement phoneNumber;
	
	@FindBy(id = "email1")
	private WebElement emailId;
	
	public void clickOnOrgLookUpImg() {
		orgLookUoImg.click();
	}
	
	public void clickonAccountNAme(String Orgdata) {
		Accountname.sendKeys(Orgdata);
	}
	
	public void ClickonPhoneNumber(String phData) {
		phoneNumber.sendKeys(phData);
	}
	
	public void clickonEmail(String email) {
		emailId.sendKeys(email);
	}

}
