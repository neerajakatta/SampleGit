package Seleniumpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

	public static void main(String[] args) throws ParseException {
		
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("hp-widget__depart")).click();
		
		//Format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//Current Date
		Date systemdate = new Date();
		System.out.println(sdf.format(systemdate));//format changed
		//String str = sdf.format(systemdate);
		Date dataToBeSelected = sdf.parse("03/10/2018");
		//Capture monthdate text in calender widget
		String monthyear = driver.findElement(By.xpath(".//div[@id='js-filterOptins']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]")).getText();
		System.out.println(monthyear);
		//Month
		String month = new SimpleDateFormat("MMMM").format(dataToBeSelected);
		//Year
		String year = new SimpleDateFormat("yyyy").format(dataToBeSelected);
		//Day
		String day = new SimpleDateFormat("dd").format(dataToBeSelected);
		//Concat month and year
		String monthyearselect = (month+" "+year).toUpperCase();
		System.out.println(monthyearselect);
		
		while(true){
			
			if(monthyear.equals(monthyearselect))
			{
				System.out.println(true);
				driver.findElement(By.xpath("//a[text()='3']")).click();
				break;
			}
			else
			{
				System.out.println(false);
				if(dataToBeSelected.after(systemdate))
				{
					//Next
					driver.findElement(By.xpath("//*[starts-with(@id,'dp1538465')]/div/div[2]/div/a/span")).click();
				}
				else
				{
					//Previous
					driver.findElement(By.xpath(".//*[starts-with(@id,'dp1538465')]/div/div[1]/div/a/span")).click();
				}
			}
			
			
			
		}
		
		
		
		
		
		

	}

}
