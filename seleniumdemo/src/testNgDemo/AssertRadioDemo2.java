package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertRadioDemo2 
{

@Test
public void radioassert()
{
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);	

			driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		    driver.manage().window().maximize();

			WebElement RadioButton=driver.findElement(By.xpath("(//input[@name='tripType'])[2]"));
			boolean actualradiobuttonisdisplayed=RadioButton.isDisplayed();
			boolean expectedradiobuttonisdisplayed=true;
			Assert.assertEquals(actualradiobuttonisdisplayed, expectedradiobuttonisdisplayed, "radiobutton is displayed");
			
			

			boolean actualradiobuttonisenabled=RadioButton.isEnabled();
			boolean expectedradiobuttonenabled=true;
			Assert.assertEquals(actualradiobuttonisenabled, expectedradiobuttonenabled, "radiobutton is enabled");

		
			boolean beforeclickactualradiobuttonisselected=RadioButton.isSelected();
			boolean beforeclickexpectedradiobuttonisselected=false;
			Assert.assertEquals(beforeclickactualradiobuttonisselected, beforeclickexpectedradiobuttonisselected, "radiobutton is selected");

		
			RadioButton.click();

			boolean afterclickactualradiobuttonselected=RadioButton.isSelected();
			boolean afterclickexpectedradiobuttonisselected=true;
			Assert.assertEquals(afterclickactualradiobuttonselected, afterclickexpectedradiobuttonisselected, "radiobutton is selected");
			driver.quit(); 

}
	
}
