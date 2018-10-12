package Seleniumpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']")).click();
		driver.findElement(By.xpath("//input[@id='btnAddAttachment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ufile']")).click();
		Runtime.getRuntime().exec("C:\\Users\\Neeraja\\Desktop\\TMTECH.exe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnSaveAttachment']")).click();
		
		
	}
	

}
