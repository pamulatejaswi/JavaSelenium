package testNgDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CloseAndQuitDemo3 
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
	    Set<String> openwindows=driver.getWindowHandles();
	    Iterator<String> windowsList=openwindows.iterator();
	    String parentWindowid=windowsList.next();
	    String childWindowid=windowsList.next();
	    	    
	    driver.switchTo().window(childWindowid);
	     	    
	    WebElement label=driver.findElement(By.xpath("//*[@id='hcfe-content']/section/div/div[1]/article/section/h1"));
		String label1=label.getText();
		System.out.println(label1);
		//driver.close();
		driver.quit();
	}


}
