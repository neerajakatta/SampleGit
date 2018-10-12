package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AngularCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://material.angular.io/components/select/overview");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//*[text()='Favorite food'])[last()]")).isSelected();
		
		
		
	}

}
