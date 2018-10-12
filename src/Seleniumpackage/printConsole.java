package Seleniumpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.jws.soap.SOAPBinding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class printConsole {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.id("lst-ib")).sendKeys("j");
		List<WebElement> options = driver.findElements(By.xpath("//div[@id='sbtc']/div[2]/div/div/div/ul/li"));
	    int k = options.size();
		System.out.println(k);
		for (int i=0; i<k; i++)
		{
			String linkText = options.get(i).getText();
			
		System.out.println(linkText);
	
	}
	}

}
