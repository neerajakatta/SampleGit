package Seleniumpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LinkCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open Testing Masters Website:
				FirefoxDriver driver = new FirefoxDriver();
				driver.get("http://TestingMasters.com/hrm/");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();

				// Login to Testing Masters 
				driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("user02");
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
					String srDate = "2018-11-23";
					boolean bflag = false;
					 for(int iRow=1;iRow<=rowCount;iRow++)
					{
						String appDate = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[1]")).getText();
						if(appDate.contentEquals(srDate))
						{
						WebElement td6 = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[6]"));
						System.out.println(td6.getText());
						td6.click();
						
						List<WebElement> element = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr/td"));
						int m = element.size();
						System.out.println(m);
						for(int i = 0;i<m;i++)
						{
							String cellText = element.get(i).getText();
							System.out.println(cellText);
						}
					
						bflag = true;
						
						//or
						// driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td[8]/select/option[2]"));			}
				
					break;	
						}
					}
					
				
				
				
				
				
				
				
	}

}
