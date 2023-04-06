package testNgDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AssertRadioDemo1 
{
	@Test
	public void google()
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

	driver.get("https://demo.guru99.com/test/newtours/reservation.php");
    driver.manage().window().maximize();

	List<WebElement>radioButton=driver.findElements(By.xpath("//input[@type='radio']"));			
	int totalElements=radioButton.size();
	System.out.println(totalElements);
	radioButton.get(1).click();
	driver.quit(); 

	}

}
