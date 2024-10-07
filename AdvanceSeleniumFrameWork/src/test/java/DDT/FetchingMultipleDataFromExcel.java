package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		//path connection
				FileInputStream fis = new FileInputStream("./src/test/resources/TestData12.xlsx");
				
				//step1:- excel file in read mode
				Workbook book = WorkbookFactory.create(fis);
				
				//step2:- get control on sheet
				Sheet sheet = book.getSheet("Sheet2");
				
			int rowNum = sheet.getLastRowNum();
			System.out.println(rowNum);
			int lastcell = sheet.getRow(0).getLastCellNum();
				System.out.println(lastcell);
				
				
			 for (int i = 0; i <rowNum; i++) 
		        {
		        	Row row = sheet.getRow(i);
		        	                         //0
		        	for (int j = 0; j < row.getLastCellNum() ; j++)
		        	{
		        		//Row row = sheet.getRow(i);
		        		Cell cell = row.getCell(j);
		               String links = cell.getStringCellValue();
					System.out.println(links); 
		        	}
				}
				
	}
	

}
