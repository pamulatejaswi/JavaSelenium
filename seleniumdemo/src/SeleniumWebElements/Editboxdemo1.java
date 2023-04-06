package SeleniumWebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Editboxdemo1 {

	public static void main(String[] args)
	{
		boolean expectedUserInputboxDisplay=true;
		
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		WebElement usernameInputbox=driver.findElement(By.xpath("//input[@type='email']"));
		boolean actualUserInputboxdisplay=usernameInputbox.isDisplayed();
		if(expectedUserInputboxDisplay==actualUserInputboxdisplay)
		{
			System.out.println("user name input box displayed");
			
		}
		else
		{
			System.out.println("user name input box not displayed");

		}
		boolean expectedUserInputboxenable=true;
		boolean actualUserInputboxenable=usernameInputbox.isEnabled();
		if(expectedUserInputboxenable==actualUserInputboxenable)
		{
System.out.println("user name input box enabled");
			
		}
		else
		{
			System.out.println("user name input box not enabled");
	}
	
	String expectedUserInputboxwatermark="Email or phone";
	
	String actualUserInputboxwatermark=usernameInputbox.getAttribute("aria-label");
	if(expectedUserInputboxwatermark.equals(actualUserInputboxwatermark))
	{
		System.out.println("user name input box watermark matched");
	}
	else
	{
		System.out.println("user name input box watermark not matched");
	}
	
	
String expectedUserOutputbox="rbg@email.com";
usernameInputbox.sendKeys(); 
String actualUserOutputbox =usernameInputbox.getAttribute("value");
System.out.println("when user enter data"+expectedUserOutputbox);
if(expectedUserOutputbox.equals(actualUserOutputbox))
{
	System.out.println("user name input box data  matched");
}
else
{
	System.out.println("user name input box data not matched");
}
}
}