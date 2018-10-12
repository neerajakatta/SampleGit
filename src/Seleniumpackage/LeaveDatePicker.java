package Seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LeaveDatePicker {

	public static void main(String[] args) {
		
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
					
			driver.findElement(By.id("menu_leave_applyLeave")).click();
			driver.findElement(By.xpath("//select[@id='applyleave_txtLeaveType']/option[2]")).click();
			
			//Select date from date picker
			driver.findElement(By.xpath("//form[@id='frmLeaveApply']/fieldset/ol/li[3]/img")).click();
			
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[1]/option[8]")).click();
			
			driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/select[2]/option[100]")).click();
			driver.findElement(By.xpath("//a[text()='22']")).click();
			
			driver.quit();
			
			
			
				
	}

}
