package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Labeltestngdemo
{
	@Test
	public  void labeltest() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("http://only-testing-blog.blogspot.com/2015/01/iframe1.html");
	    driver.manage().window().maximize();

		driver.switchTo().frame(0);
		WebElement label=driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		String expectedLableValue="Saturday, 3 January 2015";
		String actualLableValue=label.getText();
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(actualLableValue,expectedLableValue);
		s1.assertAll();
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//input[@name='Town']")).sendKeys("lucknow");
		driver.quit(); 

		
	}	
}
