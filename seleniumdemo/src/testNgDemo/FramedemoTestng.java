package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FramedemoTestng
{
	@Test
	public  void frametest() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("file:///C:/Users/abhista/Downloads/Iframe1.html");
	    driver.manage().window().maximize();

		driver.switchTo().frame(0);
		driver.switchTo().frame(0);

		//driver.switchTo().defaultContent();

		WebElement label=driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		String actualLableValue=label.getText();
		System.out.println(actualLableValue);
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@name='Town']")).sendKeys(actualLableValue);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement label1=driver.findElement(By.xpath("//*[@id='Blog1']/div[1]/div/h2/span"));
		String actualLableValue1=label1.getText();
		System.out.println(actualLableValue1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(actualLableValue1);		
		  driver.quit(); 

	} 
}
