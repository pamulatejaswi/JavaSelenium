package testNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VertcalDemoSlide2
{


	@Test
	public  void mousedragdrop() throws InterruptedException 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

	driver.get("https://jqueryui.com/droppable/");
    driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[11]/a")).click();

	driver.findElement(By.xpath("//*[@id='content']/div[1]/ul/li[4]/a")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	WebElement draggable=driver.findElement(By.xpath("//span[@style='bottom: 88%;']"));
	Actions actionobj= new Actions(driver);
	Thread.sleep(1000);

	actionobj.dragAndDropBy(draggable,0,20).perform();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	WebElement draggable1=driver.findElement(By.xpath("//span[@style='bottom: 77%;']"));

	actionobj.dragAndDropBy(draggable1, 0, 40).perform();
	   driver.quit(); 

	}


}
