package autoitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadDemo2 
{

	
		public static void main(String[] args)
		{
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
				
					driver.get("file:///C:/Users/abhista/Downloads/FileUploadDemo2.html");
				    driver.manage().window().maximize();
				    WebElement fileupload=driver.findElement(By.xpath("//input[@type='file']"));
				    fileupload.sendKeys("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\Screenshot\\screen1.png");
				    System.out.println("file uploaded");


	}

	}


