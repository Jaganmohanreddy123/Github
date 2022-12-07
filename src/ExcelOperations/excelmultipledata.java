package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelmultipledata{
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("./src/com/ExcelOperations/ssmb.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
	
		
	
	int rowcount=sheet.getLastRowNum();
	
	for (int i=0;i<=rowcount;i++)
	{
		int cellcount=sheet.getRow(i). getLastCellNum();
		
		for (int j=0;j<cellcount;j++)	
		
		{
			/*
			Row row=sheet.getRow(i);
			Cell cell=row.getcell(j);
			String data=cell.getStringCellValue();
			System.out.print(data+" ");
			*/
			
			String data=sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(data);
			
		}
		
		System.	out.println();
	}
	}
	
}


			 
			
		
	
	
	
	
	
	
	


