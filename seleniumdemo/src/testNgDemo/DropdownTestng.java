package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTestng 
{
	@Test
	public  void dropDownTest() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	    driver.manage().window().maximize();

		WebElement dropdown=driver.findElement(By.xpath("//select[@name='toMonth']"));
       Select select=new Select(dropdown);
       select.selectByIndex(0);
       select.selectByIndex(1);
       select.selectByValue("2");
       select.selectByVisibleText("April");
       select.selectByIndex(4);
       select.selectByIndex(5);
       select.selectByIndex(6);
       select.selectByIndex(7);
       select.selectByIndex(8);
       select.selectByIndex(9);
       select.selectByIndex(10);
       select.selectByIndex(11);
		driver.quit();
	   
	}
}
