package testNgDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowndemo3
{
	@Test
	public  void dropdown() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://www.meghanabus.in/");
	    driver.manage().window().maximize();

		driver.findElement(By.xpath("//img[@title='click to close']")).click();

		WebElement list=driver.findElement(By.xpath("//*[@id='search-origin']/div[1]/div/div/div[1]"));
		
		list.click();
		list.findElement(By.xpath("//*[@id='search-origin']/div[2]/div/div/div/ul/li[text()='Nellore']")).click();

	       WebElement list1=driver.findElement(By.xpath("//*[@id='search-destination']/div[1]/div/div/div[1]"));

			list1.findElement(By.xpath("//*[@id='search-destination']/div[2]/div/div/div/ul/li")).click();
			driver.quit();

		
	}
}
