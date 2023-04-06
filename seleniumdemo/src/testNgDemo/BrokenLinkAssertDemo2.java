package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinkAssertDemo2 
{
	@Test
	public  void brokenlink()   
	{
	    ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("file:///C:/Users/abhista/Downloads/link2.html");
	    driver.manage().window().maximize();

		WebElement link=driver.findElement(By.tagName("a"));
		String actualLink= link.getAttribute("href");
		Assert.assertEquals(actualLink, "", "link is broken");
		driver.quit(); 

	//	if(actualLink.equals(""))
//		{
//			System.out.println("link is broken");
//			
//		}
//		else
//		{
//			System.out.println("link is working fine");
//		}


	}

}


