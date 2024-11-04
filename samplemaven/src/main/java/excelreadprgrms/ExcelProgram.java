package excelreadprgrms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelProgram {
	static FileInputStream fis; //it helps to open excel file 
	static XSSFWorkbook xw; //it helps to open and modify the workbook
	static XSSFSheet xs; //it helps to open workbook sheet 
	
	public static String getstringdata(int a, int b) throws IOException { //row and cell
		fis = new FileInputStream("F:\\My files\\Book1.xlsx");
		xw =new XSSFWorkbook(fis);
		xs =xw.getSheet("Sheet1");//to get sheet
		XSSFRow xr = xs.getRow(a);
		XSSFCell xc= xr.getCell(b);
		return xc.getStringCellValue();
				
	}
	public static String getintegerdata(int a, int b) throws IOException {
		fis = new FileInputStream("F:\\My files\\Book1.xlsx");
		xw =new XSSFWorkbook(fis);
		xs =xw.getSheet("Sheet1");
		XSSFRow xr = xs.getRow(a);
		XSSFCell xc= xr.getCell(b);
		int x=(int) xc.getNumericCellValue();
		return String.valueOf(x);		
		
}
}
