package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertMultipleDataToExcelSheet {

	public static void main(String[] args) throws Throwable {
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData12.xlsx");
		
		//step1:- excel file in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step2:- get control on sheet
		Sheet sheet = book.getSheet("Sheet2");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		//add the links from the amazon site to excel
		for (int i = 0; i < alllinks.size(); i++) {
			Row row = sheet.createRow(i);
			Cell cel = row.createCell(0);
			cel.setCellValue(alllinks.get(i).getAttribute("href"));
			
	
		}
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/TestData12.xlsx");
		book.write(fos);
		book.close();

	}

}
