package testNgDemo;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinkAssertDemo3 
{
	@Test
	public  void brokenlink() throws Throwable 
	{
	    ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("file:///C:/Users/abhista/Downloads/BrokenLink1.html");
	    driver.manage().window().maximize();

		WebElement link=driver.findElement(By.tagName("a"));
		String actualLink= link.getAttribute("href");
		URL url=new URL(actualLink);
		HttpURLConnection huc=(HttpURLConnection)url.openConnection();
		huc.connect();
		int responsecode=huc.getResponseCode();
		System.out.println("responsecode : "+responsecode);
		int Actualrespcode=responsecode;
		int Expectedrespcode=200;
		Assert.assertEquals(Actualrespcode, Expectedrespcode);
//		if( responsecode>=400)
//		{
//			System.out.println("link was broken");
//			
//		}
//		else
//{
//	System.out.println("link is working fine");
//}
		driver.quit(); 


	}
}
