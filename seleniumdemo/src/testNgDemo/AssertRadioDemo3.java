package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AssertRadioDemo3 
{
	@Test
	public void radioassert()
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	    driver.manage().window().maximize();

		WebElement radioButton=driver.findElement(By.xpath("(//input[@type='radio'])[5]"));			
		radioButton.click();
		driver.quit(); 

	}
}
