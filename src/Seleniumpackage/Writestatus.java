package Seleniumpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Writestatus {
	WebDriver driver;
	int i;
	XSSFSheet sh;
	XSSFWorkbook wb;
	String URL;
	String UID;
	String PID;
	String LID;
	String Username;
	String Password;
	
		public void read() throws IOException{
		
		File f = new File("C:\\Users\\Neeraja\\Desktop\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		System.out.println(rowcount);
		for(i=1;i<=rowcount;i++)
		{					
			URL = sh.getRow(i).getCell(1).getStringCellValue();
			UID = sh.getRow(i).getCell(2).getStringCellValue();
			PID = sh.getRow(i).getCell(3).getStringCellValue();
			LID = sh.getRow(i).getCell(4).getStringCellValue();
			Username = sh.getRow(i).getCell(5).getStringCellValue();
			Password = sh.getRow(i).getCell(6).getStringCellValue();
			
			App();
			}
		
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		fo.flush();
		wb.close();
		
		}
	
	public void App()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.id(UID)).sendKeys(Username);
		driver.findElement(By.id(PID)).sendKeys(Password);
		driver.findElement(By.id(LID)).click();
		String currenturl = driver.getCurrentUrl();
		if(currenturl.contains("dashboard"))
		{
			System.out.println("Login Successfully");
			sh.getRow(i).createCell(7).setCellValue("Pass");
			driver.close();
		}
		else
		{
			System.out.println("Failed");
			sh.getRow(i).createCell(7).setCellValue("Fail");
			driver.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writestatus w = new Writestatus();
		w.read();
	}
}
