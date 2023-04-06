package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertDemo2
{
	@Test
	public  void alerttest() throws InterruptedException
	{
	ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://www.meghanabus.in/index.html");
	    driver.manage().window().maximize();

		driver.findElement(By.xpath("//img[@title='click to close']")).click();
		driver.findElement(By.xpath("//a[@title='Manage Bookings']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);

		String alertText=driver.switchTo().alert().getText();
		System.out.println("this is alert text : "+alertText);
		driver.switchTo().alert().dismiss();
		String data=driver.findElement(By.xpath("//*[@id='manage_booking']/div[1]/div[1]/div[1]/span")).getText();
		System.out.println(data);
		driver.quit(); 

	}

	}



