package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertingDatatoExcelSheet {

	public static void main(String[] args) throws Throwable, Throwable {
		
		//path connection
				FileInputStream fis = new FileInputStream("./src/test/resources/TestData11.xlsx");
				
				//step1:- excel file in read mode
				Workbook book = WorkbookFactory.create(fis);
				
				//step2:- get control on sheet
				Sheet sheet = book.getSheet("Sheet1");
				
				//inserting data
				Row row = sheet.createRow(3);
				Cell cell = row.createCell(3);
				cell.setCellValue("nidhi");
				
				//to keepworkbook in Write mode
				FileOutputStream fos = new FileOutputStream("E:\\\\nidhi\\\\Documents\\\\TestData11.xlsx");
				book.write(fos);
				book.close();
	}

}
