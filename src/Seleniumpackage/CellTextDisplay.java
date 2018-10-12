		package Seleniumpackage;

		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.interactions.Actions;
		

		public class CellTextDisplay {

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
				
			/*	//Get WebTable Cell Text
				String strcellText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td[1]")).getText();
				System.out.println(strcellText);
			*/					
				//Get Row Count
				List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
				int rowCount = Rows.size();
				System.out.println("Row Count is:" + rowCount);
				
				//Get Column count
				List<WebElement> Cols = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td"));
				int colCount = Cols.size();
				System.out.println("Col Count is:" + colCount);		
				
				//Get all cell texts for a column in a row
			/*	for(int icol=1;icol<colCount;icol++)	
				{	
			String strcellText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[1]/td["+icol+"]")).getText();
				System.out.println(strcellText);
				}*/
		
				
				//Get webtable all cells and texts in a row
				for(int iRow=1;iRow<rowCount;iRow++)
				{				
				for(int icol=1;icol<colCount;icol++)
				{	
			String strcellText = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+iRow+"]/td["+icol+"]")).getText();
				System.out.println(strcellText);
				
				}
		
	}
driver.quit();
			}}
