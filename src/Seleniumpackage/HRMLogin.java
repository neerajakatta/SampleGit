package Seleniumpackage;


import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMLogin {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.quit();

	}

}
