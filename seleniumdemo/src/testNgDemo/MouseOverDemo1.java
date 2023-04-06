package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverDemo1 
{
	@Test
	public  void mouseTest() throws InterruptedException 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

	driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();

	WebElement dragselect=driver.findElement(By.xpath("//*[@id='icp-nav-flyout']/span/span[2]/span[2]"));
	Actions actionobj= new Actions(driver);
	actionobj.moveToElement(dragselect).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='icp-flyout-mkt-change']/span/div")).click();
	driver.quit(); 


}
}
