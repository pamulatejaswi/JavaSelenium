package frameWorkDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class GenericMethods
{
	WebDriver driver;
	

		public void openBrowser(String browserName)
		{
		if(browserName=="chrome")
		{
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);	
		}
		else if(browserName=="edge")
		{
			 driver=new EdgeDriver();
		}
		}
		
		public void enterURL(String url)
		{
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		}
		
		public void enterData(String locatorType,String locatorValue,String data) 
		{

			if(locatorType.equals("xpath"))
			{		
				
			driver.findElement(By.xpath(locatorValue)).sendKeys(data);
			}

			else if(locatorType.equals("name"))
			{
			driver.findElement(By.name(locatorValue)).sendKeys(data);
			}
		}
		
		public void clickOnElement(String locatorType,String locatorValue)
		{
			if(locatorType.equals("xpath"))
			{		
			
			driver.findElement(By.xpath(locatorValue)).click();	
			}
		}
	}



