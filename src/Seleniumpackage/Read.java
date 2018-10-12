package Seleniumpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Neeraja\\Desktop\\Book1.xlsx"); 				
		
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet4");
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			int celcount = sh.getRow(i).getLastCellNum();
			for(int j=0;j<celcount;j++){
			
			String str = sh.getRow(i).getCell(j).getStringCellValue();
			//String str1 = sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.print(str);
			
			}
			System.out.println();
			
			
		}
		

	}

}
