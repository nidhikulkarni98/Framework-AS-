package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindAll;

public class vtigerLoginPage {
	
	
	
	//Initialzation 
	public vtigerLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//declaration
	@FindBy(name = "user_name")
	private WebElement userTextField;
	
	// AND
//		@FindBys({@FindBy(css = "[type=\"password\"]"),@FindBy(name = "user_password")})
		@FindBy(name = "user_password")
		private WebElement passWordTextField;
		
		// OR
		@FindAll({ @FindBy(xpath = "//input[@type=\"submit\"]"), @FindBy(id = "submitButton") })
		private WebElement loginButton;
		
		
		//getters 
		public WebElement getUserTextField() {
			return userTextField;
		}

		public WebElement getPassWordTextField() {
			return passWordTextField;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		
		//Business Logic
		public void loginToVitger(String username, String Password) {
			userTextField.sendKeys(username);
			passWordTextField.sendKeys(Password);
			loginButton.click();
		}
		
		
		
		
		


}
