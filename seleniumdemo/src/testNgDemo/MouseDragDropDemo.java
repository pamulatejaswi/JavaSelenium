package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseDragDropDemo 
{
	@Test
	public  void mousedragdrop() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

	driver.get("https://jqueryui.com/droppable/");
    driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id='sidebar']/aside[2]/ul/li[11]/a")).click();
	driver.switchTo().defaultContent();

	driver.switchTo().frame(0);

	WebElement draggable=driver.findElement(By.xpath("//span[@style='left: 0%;']"));
	Actions actionobj= new Actions(driver);

	actionobj.dragAndDropBy(draggable, 40, 40).perform();
    driver.quit(); 

}
}
