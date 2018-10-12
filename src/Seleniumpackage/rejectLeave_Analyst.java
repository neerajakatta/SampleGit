package Seleniumpackage;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 
	public class rejectLeave_Analyst {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
        driver.get("http://testingmasters.weebly.com/webtables.html");
        driver.manage().window().maximize();
        List<WebElement> dropdown = driver.findElements(By.xpath("//table/thead/tr/th[5]/parent::tr/parent::thead/following::tbody/tr/td[5][text()='Analyst']//following-sibling::td[3]/select"));
        int n = dropdown.size();
        System.out.println(n);

		  for(int i = 0;i<n;i++){
          WebElement ele = dropdown.get(i);
          Select sel = new Select(ele);
          //String str = sel.getFirstSelectedOption().getText();
          sel.selectByVisibleText("Rejected");
              /*if(str.equals("Accepted")){
          System.out.println("Accepted");
        }
         else
       {
         System.out.println("Not there");
        }
		                                                */
                                          
               
       }
	 
		}
}
