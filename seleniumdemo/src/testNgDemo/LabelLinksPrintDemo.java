package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LabelLinksPrintDemo 
{
	@Test
	public  void labelLink() 
	{
	    ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://www.meghanabus.in/index.html");
	    driver.manage().window().maximize();

		try{
		
				
			driver.findElement(By.xpath("//img[@title='click to close']")).click();
		}
		catch(Exception e)	
		{
		System.out.println("image not found");
		}
		
finally
{
	

		String homelink=driver.findElement(By.xpath("//a[@title='Home']")).getText();
		System.out.println(homelink);
		
		String managebookinglink=driver.findElement(By.xpath("//a[@title='Manage Bookings']")).getText();
		System.out.println(managebookinglink);
		
		String gallerylink=driver.findElement(By.xpath("//a[@title='Gallery']")).getText();
		System.out.println(gallerylink);

		String aboutuslink=driver.findElement(By.xpath("//a[@title='About Us']")).getText();
		System.out.println(aboutuslink);
		
		String contactlink=driver.findElement(By.xpath("//a[@title='Contact']")).getText();
		System.out.println(contactlink);
		driver.quit(); 

}	
			
}
}