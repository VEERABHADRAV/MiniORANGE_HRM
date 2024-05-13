package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachiPoi {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\2317337\\eclipse-workspace\\selenium\\Folder\\Hackathon 1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("TEST CASES");
		
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(1).getLastCellNum();
		
		System.out.println(rows + "  "+cells);
		
		for(int r=0;r<=rows;r++)
		{
			
			XSSFRow cr=sheet.getRow(r);
			for(int c=0;c<cells;c++)
			{
				String s = cr.getCell(c).toString();
				
				System.out.println(s);
			}	
			
		}
		workbook.close();
		file.close();
		
		
	}

	
}
