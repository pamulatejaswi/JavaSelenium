package cucuseletestng;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class Test1 
{
	@Test
	public void google() throws Throwable
	{
		ChromeOptions co= new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("file:///C:/Users/abhista/Downloads/link.html");
		WebElement link=driver.findElement(By.tagName("a"));
		System.out.println(link);
		String link1=link.getAttribute("href");
		System.out.println(link1);
		URL url=new URL(link1);
		HttpURLConnection h= (HttpURLConnection)url.openConnection();
		h.connect();
		int resp=h.getResponseCode();
		System.out.println(resp);
		
		
if(resp>=400)		
{
	System.out.println("link broken");
}
	}
	
	

}
