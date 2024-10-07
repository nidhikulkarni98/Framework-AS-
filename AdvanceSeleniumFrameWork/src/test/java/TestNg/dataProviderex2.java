//package TestNg;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Random;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//public class dataProviderex2 {
//	
//	
//	@Test(dataProvider = "readData")
//	public void organizationModuleTest(String orgName, String phnNum, String mailId) throws Throwable {
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://localhost:8888/");
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("admin");
//		driver.findElement(By.id("submitButton")).click();
//		
//		driver.findElement(By.linkText("Organizations")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("accountname")).sendKeys(orgName);
//		driver.findElement(By.id("phone")).sendKeys(phnNum);
//		driver.findElement(By.id("email1")).sendKeys(mailId);
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		driver.findElement(By.linkText("Sign Out")).click();
//		driver.quit();
//	}
//	
//	@DataProvider
//	public Object[][] readData() throws Throwable{
////		
////		Random rannum = new Random();
////		int ranNum = rannum.nextInt(2000);
//		//Object[][] obj = new Object[3][3];
//		/*//path connection
//		FileInputStream fiss = new FileInputStream("./src/test/resources/TestData11.xlsx");
//		
//		//step1:- excel file in read mode
//		Workbook book = WorkbookFactory.create(fiss);
//		
//		//step2:- get control on sheet
//		Sheet sheet = book.getSheet("Organization");
//		
//		//step3:- get control on row
//		Row row = sheet.getRow(0);
//		
//		//step4:- get control on cell
//		Cell cell = row.getCell(0);
//		
//		
//		//step5:- get the data
//		obj[0][0]= cell.getStringCellValue();
//		
//		//step2:- get control on sheet
//				Sheet sheet1 = book.getSheet("Organization");
//				
//				//step3:- get control on row
//				Row row1 = sheet1.getRow(1);
//				
//				//step4:- get control on cell
//				Cell cell1 = row1.getCell(0);
//				
//				
//				//step5:- get the data
//				DataFormatter format = new DataFormatter();
//				String formatedata = format.formatCellValue(cell1);
//				obj[0][1]= formatedata+ranNum;
//				
//				
//		
//				//step2:- get control on sheet
//				Sheet sheet2 = book.getSheet("Organization");
//				
//				//step3:- get control on row
//				Row row2 = sheet2.getRow(2);
//				
//				//step4:- get control on cell
//				Cell cell2 = row2.getCell(0);
//				
//				
//				//step5:- get the data
//				DataFormatter format1 = new DataFormatter();
//				String formatedata1 = format1.formatCellValue(cell2);
//				obj[0][2]= formatedata1;
//		
//		
//				return obj;*/
//		
//		
//		Random rannum = new Random();
//		int ranNum = rannum.nextInt(2000);
//		Object[][] obj = new Object[3][3];
//		obj[0][0]="BBB"+ranNum;
//		obj[0][1]="987654321";
//		obj[0][2]="abc@gmail.com";
//		
//		obj[1][0]="AAA"+ranNum;
//		obj[1][1]="987654321";
//		obj[1][2]="abc@gmail.com";
//		
//		obj[2][0]="CCC"+ranNum;
//		obj[2][1]="987654321";
//		obj[2][2]="abc@gmail.com";
//		return obj;
//		
//		
//		
//	}
//
//}
