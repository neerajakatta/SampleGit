package Seleniumpackage;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getUrl {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String ActTitle=driver.getTitle();
		if(ActTitle.equals("Google"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();		
		

	}

}
