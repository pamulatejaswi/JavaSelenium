package testNgDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitleDemo2 
{
	@Test
	public  void TitleTest() 
	{
	ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://demo.guru99.com/test/newtours/index.php");
	    driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

         String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle="Login: Mercury Tours";
		Assert.assertEquals(actualTitle,expectedTitle);
		driver.quit(); 

	}
		
	
	
	
	}
