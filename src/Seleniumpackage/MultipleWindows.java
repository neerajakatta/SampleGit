package Seleniumpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.talentzing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("FAQ")).click();
		driver.findElement(By.linkText("FeedBack")).click();
		Thread.sleep(3000);
		String HomePage = driver.getWindowHandle();
		Set<String>allhandles = driver.getWindowHandles();
		
		for(String wndhandles: allhandles){
			 String pageURL = driver.getCurrentUrl();
		if(pageURL.contains("FeedBack"))
		{
			System.out.println("switch to feedback page");
			driver.findElement(By.id("txtfullName")).sendKeys("TM");
			Thread.sleep(1000);
			driver.close();
				
		driver.switchTo().window(HomePage);
		driver.quit();
}
		}
}
	
		
		
	}


