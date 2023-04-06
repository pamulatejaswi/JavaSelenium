package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CloseAndQuitDemo2
{
	@Test
	public  void closeandquit() throws InterruptedException 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://www.gmail.com");
	    driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id='yDmH0d']/c-wiz/div/div[2]/div/div[1]/span/div/div/a")).click();
	   // driver.close();
		driver.quit();
	    System.out.println("done");
	      driver.quit(); 

	
	}
	
	
	

}
