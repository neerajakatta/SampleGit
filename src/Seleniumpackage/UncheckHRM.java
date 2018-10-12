package Seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class UncheckHRM {

	public static void main(String[] args) {
	
		// Open Testing Masters Website:
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://TestingMasters.com/hrm/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// Login to Testing Masters 
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user01");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Move mouse to leave menu
		Actions Act_obj = new Actions(driver);
		WebElement leave = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Act_obj.moveToElement(leave).build().perform();
		
		//click My Leave option under Leave tab
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		
		//Uncheck all the checkbox
		driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
		
		driver.findElement(By.id("btnSearch")).click();
		driver.findElement(By.id("btnReset")).click();
		driver.quit();

	}

}
