package Seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
                          
public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//driver.findElement(By.id("login1")).sendKeys("user01");
		//driver.findElement(By.id("password")).sendKeys("pass1234");
		driver.findElement(By.xpath("//*[@value = 'Go']")).click();
		Thread.sleep(2000);

		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		//driver.switchTo().alert().accept();
		alert.accept();
		}

}
