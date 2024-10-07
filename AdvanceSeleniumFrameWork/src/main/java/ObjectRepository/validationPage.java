package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class validationPage {

	//Initialzation 
	public validationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

			
			//validation if campaign is created
	public void CampaignPage(WebDriver driver , String CampData ) {
		String actName = driver.findElement(By.xpath("//span[@id='dtlview_Campaign Name']")).getText();
		
		Assert.assertEquals(actName, CampData,"Assert fails, name not created");
		System.out.println("campaing name is created");
		
//		if(actName.equalsIgnoreCase(CampData))
//		{
//			System.out.println("campaing name is created");
//		}
//		else
//		{
//			System.out.println("campaing name not created");
//		}
		
	}
		
	//varifying if org name is created
    public void orgPageNameValidation(WebDriver driver ,String OrgData) {
    
		String actName1 = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
		
		Assert.assertEquals(actName1, OrgData,"Assert fails, name not created");
		System.out.println("Organization name is created");
		
//		if(actName1.equalsIgnoreCase(OrgData))
//		{
//			System.out.println("Organization name is created");
//		}
//		else
//		{
//			System.out.println("Organization name not created");
//		}
		
    }
    
    
    
    //varifying is product name is created
    public void productPageValidation(WebDriver driver, String prodata) {
    String actName = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
    
    Assert.assertEquals(actName, prodata,"Assert fails, name not created");
	System.out.println("product name is created");
	
//	if(actName.equalsIgnoreCase(prodata))
//	{
//		System.out.println("product name is created");
//	}
//	else
//	{
//		System.out.println("product name not created");
//	}
    }
    
    
    
    
    //varifying is product is deleted
    public void DeleteProductValidation(WebDriver driver , String prodata) {
    	List<WebElement> productList = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr//td[3])[position()>1]"));

    	boolean flag=false;
    	 	 for(WebElement prdName1:productList)
    	 {
    		String actData = prdName1.getText();
    		if(actData.contains(prodata))
    		{
    			flag=true;
    			break;
    		}
    	 }
    	if(flag)
    	{
    		System.out.println("product data not deleted");
    	}
    	else
    	{
    		System.out.println("product data is deleted");
    	}
    	
    	
    	
    	
    }
    
	}
	
	
