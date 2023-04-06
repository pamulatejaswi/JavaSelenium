package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class VerticalSlideDemo 
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

	driver.findElement(By.xpath("//*[@id='content']/div[1]/ul/li[11]/a")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(0);
	Thread.sleep(1000);
	WebElement draggable=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
	Actions actionobj= new Actions(driver);

	actionobj.dragAndDropBy(draggable, 67, 90).perform();
    driver.quit(); 

}

}
