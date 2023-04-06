package testNgDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ScreenshotDemo1 
{
	@Test
	public  void testScreenshot() throws IOException 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://www.gmail.com");
	    driver.manage().window().maximize();
	    TakesScreenshot ts= (TakesScreenshot)driver;
	  File source= ts.getScreenshotAs(OutputType.FILE);
	  File targetpath=new File("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\Screenshot\\screen1.png");
	    FileUtils.copyFile(source, targetpath);
	    System.out.println("done");
	}
	}

