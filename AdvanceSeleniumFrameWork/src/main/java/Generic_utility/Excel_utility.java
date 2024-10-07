package Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this method is used to read data from excel
 */
public class Excel_utility {
	
	
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable {
		//path connection
				FileInputStream fiss = new FileInputStream(ipathConstant.ExcelPath);
				
				//step1:- excel file in read mode
				Workbook book = WorkbookFactory.create(fiss);
				
				//step2:- get control on sheet
				Sheet sheet = book.getSheet(sheetName);
				
				//step3:- get control on row
				Row row = sheet.getRow(rowNum);
				
				//step4:- get control on cell
				Cell cell = row.getCell(cellNum);
				
				
				//step5:- get the data
				String data = cell.getStringCellValue();
				
				return data;
	}
	
	
	
	
	
	
	/**
	 * this method is used to read data using data formatter
	 * @param sheetName1
	 * @param rowNum1
	 * @param colNum2
	 * @return
	 * @throws Throwable
	 */
	
	public String getExcelDatausingDataFormatter(String sheetName1, int rowNum1, int colNum2) throws Throwable {
		
		//path connection
		FileInputStream fiss = new FileInputStream(ipathConstant.ExcelPath);
		
		//step1:- excel file in read mode
		Workbook book = WorkbookFactory.create(fiss);
		
		//step2:- get control on sheet
		Sheet sheet = book.getSheet(sheetName1);
		
		//step3:- get control on row
		Row row = sheet.getRow(rowNum1);
		
		//step4:- get control on cell
		Cell cell = row.getCell(colNum2);
		
		//step6:-fetching the cell value
		DataFormatter format = new DataFormatter();
		String formatedata = format.formatCellValue(cell);
		
		return formatedata;
		
	}
	
	
	public Object[][] getDataProviderData(String sheetName) throws Throwable
	{
		
		FileInputStream fis = new FileInputStream("D:\\Qspider_eclipse_workspace\\AdvanceSeleniumFrameWork\\src\\test\\resources\\TestData12.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		int lastRow = sheet.getLastRowNum()+1;
		int lastCell = sheet.getRow(0).getLastCellNum();
		
		Object[][] objArr = new Object[lastRow][lastCell];
		
		for (int i = 0; i <lastRow ; i++)
		{
		for (int j = 0; j <lastCell ; j++)
		{
			objArr[i][j]=sheet.getRow(i).getCell(j).toString();
		}	
		}
		
		return objArr;
		
	}

}
