package ExcelOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hdgf.streams.Stream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.dev.XSSFDump;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteOperation {

	public static void main(String[] args) throws IOException {
		
FileInputStream file=new FileInputStream("./src/com/ExcelOperations/JaganExcelfile.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet Sheet=workBook.getSheet("Sheet1");
		Row row=Sheet.createRow(1);
		Cell cell=row.createCell(2);
		cell.setCellValue("selenium");                
FileOutputStream file1=new  FileOutputStream("./src/com/ExcelOperations/JaganExcelfile.xlsx");
		
		workBook.write(file1);
		
		
	}

		
}


