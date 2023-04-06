package autoitdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutoItDemo1 {

	public static void main(String[] args) throws InterruptedException {
		

			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
				
					driver.get("file:///C:/Users/abhista/Downloads/FileUploadDemo1.html");
				    driver.manage().window().maximize();
				  WebElement fileupload=driver.findElement(By.xpath("//input[@type='file']"));
				 // fileupload.click();
				  Thread.sleep(10000);
				 // Runtime.getRuntime().exec(autoitdemo1.exe);
				  System.out.println("file uploaded");


	}

	}


