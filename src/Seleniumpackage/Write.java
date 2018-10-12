package Seleniumpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\Neeraja\\Desktop\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sh = wb.getSheet("Sheet4");
		Row r0 =sh.createRow(0);
		Row r1 =sh.createRow(1);
		Row r2 = sh.createRow(2);
		//create first row
		r0.createCell(0).setCellValue(" ");
		r0.createCell(1).setCellValue("URL");
		r0.createCell(2).setCellValue("UserID");
		r0.createCell(3).setCellValue("PassID");
		r0.createCell(4).setCellValue("LogID");
		r0.createCell(5).setCellValue("UserName");
		r0.createCell(6).setCellValue("PassWord");
		r0.createCell(6).setCellValue("Status");
		
		//create second row
		r1.createCell(0).setCellValue("TC01");
		r1.createCell(1).setCellValue("http://testingmasters.com/hrm");
		r1.createCell(2).setCellValue("txtUsername");
		r1.createCell(3).setCellValue("txtPassword");
		r1.createCell(4).setCellValue("btnLogin");
		r1.createCell(5).setCellValue("user01");
		r1.createCell(6).setCellValue("pass1234");
		
			
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.flush();
		wb.close();
		
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
