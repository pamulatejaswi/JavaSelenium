package testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Titledemo1 
{
	@Test
	public  void titletest() 
	{
	ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	    driver.manage().window().maximize();

		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Find a Flight: Mercury Tours: ";
		Assert.assertEquals(actualTitle,expectedTitle);
		driver.quit(); 

	}
}
