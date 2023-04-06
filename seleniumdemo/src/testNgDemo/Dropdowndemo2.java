package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdowndemo2
{
	@Test
	public  void dropdown() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	    driver.manage().window().maximize();

		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='toPort']"));
	       Select select1=new Select(dropdown1);
	       select1.selectByValue("Acapulco");
	       select1.selectByValue("Frankfurt");
	       select1.selectByValue("London");
	       select1.selectByValue("New York");
	       select1.selectByValue("Paris");
	       select1.selectByValue("Portland");
	       select1.selectByValue("San Francisco");
	       select1.selectByValue("Seattle");
	       select1.selectByValue("Sydney");
	       select1.selectByValue("Zurich");
			driver.quit();

	}

}
