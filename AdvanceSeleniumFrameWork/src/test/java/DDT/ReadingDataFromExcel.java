package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		//path connection
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData12.xlsx");
		
		//step1:- excel file in read mode
		Workbook book = WorkbookFactory.create(fis);
		
		//step2:- get control on sheet
		Sheet sheet = book.getSheet("Sheet1");
		
		//step3:- get control on row
		Row row = sheet.getRow(2);
		
		//step4:- get control on cell
		Cell cell = row.getCell(2);
		
		//step5:- get the data
		//String data = cell.getStringCellValue();
		//double data = cell.getNumericCellValue();
		
		//using DataFormatter
		DataFormatter formate = new DataFormatter();
		String data = formate.formatCellValue(cell);
		
		//step6:- print data
		System.out.println(data);
	}

}
