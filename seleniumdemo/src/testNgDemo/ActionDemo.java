package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionDemo 
{
	@Test
	public  void ActionTest() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

	driver.get("https://jqueryui.com/droppable/");
    driver.manage().window().maximize();

	driver.switchTo().frame(0);

		WebElement draggable=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions actionobj= new Actions(driver);
		actionobj.dragAndDrop(draggable, droppable).perform();
		System.out.println("done");
		   driver.quit(); 
	

}
}