package testNgDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CloseAndQuitDemo1 
{
	@Test
	public  void closeandquit() throws InterruptedException 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();

		driver.close();
      driver.quit(); 

	}
}
