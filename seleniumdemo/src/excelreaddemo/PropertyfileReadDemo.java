package excelreaddemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PropertyfileReadDemo 
{
	WebDriver driver;

	@Test
	public void fInOutTest() throws IOException
	{
		
	FileInputStream fin=new FileInputStream("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\text1.properties.properties");
	Properties prop=new Properties();
    prop.load(fin);
    String keyvalue=prop.getProperty("browser");
    System.out.println("keyvalue for browser : "+keyvalue);
    
	if(keyvalue.equals("chrome"))
	{
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(co);	
		
	}
	String url1=prop.getProperty("url");
    System.out.println("url for browser : "+url1);
    		
			driver.get(url1);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			String uname=prop.getProperty("username");
		    System.out.println("username for browser : "+uname);
		   		

			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
			
			String password1=prop.getProperty("password");
		    System.out.println("password for browser : "+password1);
		   

			driver.findElement(By.name("password")).sendKeys(password1);
			
						
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();	
			}
		}
	


