package readDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		//File location
		FileInputStream fis = new FileInputStream(".\\testData\\RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		//workbook.getSheetAt(0); //index - start from 0
		XSSFSheet Sheet = workbook.getSheet("smokeTest");
		//XSSFSheet Sheet = workbook.getSheet("Student");
		
		int rowsCount = Sheet.getLastRowNum();
		int columnCount = Sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Rows Count: " + rowsCount);
		System.out.println("Columns Count: " + columnCount);

		
		for(int i=1; i <=rowsCount; i++) {
			
			XSSFRow currentRow = Sheet.getRow(i);
			
			
			String firstName = currentRow.getCell(0).toString();
			String lastName = currentRow.getCell(1).toString();
			String email = currentRow.getCell(2).toString();
			String mobile = currentRow.getCell(3).toString();
			String address = currentRow.getCell(4).toString();
			
			
			
			
			
			
			
			System.out.println("FirstName: " + firstName);
			System.out.println("Address details: " + address);
			System.out.println("------------------------------");
			
			
		}
		
		
		
		
	}

}
