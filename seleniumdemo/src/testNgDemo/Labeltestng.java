package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Labeltestng
{
	@Test
		public  void funa() 
		{
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);	
	
			driver.get("https://www.gmail.com");
		    driver.manage().window().maximize();

//			String a= driver.findElem ent(By.xpath("//div[@class='tosRNd']")).getText();
//			System.out.println(a);
//			
//			String b="to continue to Gmail";
//			if(a.equals(b))
//			{
//				System.out.println("label is same");
//			}
//			else
//			{
//				System.out.println("label is not same");
	//
//			}
			
		//driver.findElement(By.xpath("//a[@target='_blank']"));
		//System.out.println(s);	
			//driver.findElement(By.linkText("Learn more")).click();
	//driver.findElement(By.partialLinkText("more")).click();
		//System.out.println(k);
		
	//driver.findElement(By.cssSelector("input[id$='erId']")).sendKeys("67895");
//			//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("67895");
	//driver.findElement(By.cssSelector("input[id^='iden']")).sendKeys("67895");
	//driver.findElement(By.cssSelector("input[id*='tifi']")).sendKeys("67895");
	//driver.findElement(By.cssSelector("input[id='identifierId'][type='email']")).sendKeys("abc");
	String expectedLableValue="to continue to gmail";
	WebElement label=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
	String actualLableValue=label.getText();
	System.out.println("actualLableValue : "+actualLableValue);
	SoftAssert s=new SoftAssert();
	//if(actualLableValue.equals(expectedLableValue))
	
	s.assertEquals(actualLableValue,expectedLableValue,"label is same");
	//System.out.println("label is same");
	//s.assertNotEquals(actualLableValue,expectedLableValue,"label is not same");
	//System.out.println("label is not same");

	s.assertAll();
	driver.quit(); 

		}

	}



