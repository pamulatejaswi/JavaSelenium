package SeleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Labeltesting {

	public static void main(String[] args) {
		

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		
//		String a= driver.findElement(By.xpath("//div[@class='tosRNd']")).getText();
//		System.out.println(a);
//		
//		String b="to continue to Gmail";
//		if(a.equals(b))
//		{
//			System.out.println("label is same");
//		}
//		else
//		{
//			System.out.println("label is not same");
//
//		}
		
	//driver.findElement(By.xpath("//a[@target='_blank']"));
	//System.out.println(s);	
		//driver.findElement(By.linkText("Learn more")).click();
//driver.findElement(By.partialLinkText("more")).click();
	//System.out.println(k);
	
//driver.findElement(By.cssSelector("input[id$='erId']")).sendKeys("67895");
//		//driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("67895");
//driver.findElement(By.cssSelector("input[id^='iden']")).sendKeys("67895");
//driver.findElement(By.cssSelector("input[id*='tifi']")).sendKeys("67895");
driver.findElement(By.cssSelector("input[id='identifierId'][type='email']")).sendKeys("abc");
String expectedLableValue="to continue to gmail";
WebElement label=driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
String actualLableValue=label.getText();
System.out.println("actualLableValue : "+actualLableValue);
if(actualLableValue.equals(expectedLableValue))
{
	
		System.out.println("label is same");
		
	}
	else
	{
		System.out.println("label is not same");

	}
	}

}
