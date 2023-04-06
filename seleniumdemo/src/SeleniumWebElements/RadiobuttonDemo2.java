package SeleniumWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadiobuttonDemo2 {

	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);

		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		List<WebElement>radioButton=driver.findElements(By.xpath("//input[@type='radio']"));			
		int totalElements=radioButton.size();
		System.out.println(totalElements);
		radioButton.get(1).click();


	}

}
