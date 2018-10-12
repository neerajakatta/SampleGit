package Seleniumpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CancelLeave {

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
		
		//Get Row Count
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowCount = Rows.size();
		System.out.println("Row Count is:" + rowCount);
		
		// Select Date
		String srcDate = "2018-11-23";
		boolean bFlag = false;
		 for(int iRow=1;iRow<=rowCount;iRow++)
		{
			String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[1]")).getText();
			if(appDate.contentEquals(srcDate))
			{
			WebElement dropdown = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[8]/select"));
			Select obj = new Select(dropdown);
			obj.selectByVisibleText("Cancel");
			
			//or
			// driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[8]/select/option[2]"));			}
		bFlag = true;
		break;	
			}
		}
		 
		//click save
		 // if(bFlag)
			// driver.findElement(By.id("btnSave")).click();
	//	 else
		//	 System.out.println("Date not found");

		 driver.quit();
					}
		
	}

