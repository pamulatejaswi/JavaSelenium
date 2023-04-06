package SeleniumWebElements;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brokenlinkdemo3 {

	public static void main(String[] args) throws Throwable 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
	
				
		driver.get("file:///C:/Users/abhista/Downloads/BrokenLink1.html");
		WebElement link=driver.findElement(By.tagName("a"));
		String actualLink= link.getAttribute("href");
		URL url=new URL(actualLink);
		HttpURLConnection huc=(HttpURLConnection)url.openConnection();
		huc.connect();
		int responsecode=huc.getResponseCode();
		System.out.println("responsecode : "+responsecode);
		if( responsecode>=400)
		{
			System.out.println("link was broken");
			
		}
		else
{
	System.out.println("link is working fine");
}

	}

}
