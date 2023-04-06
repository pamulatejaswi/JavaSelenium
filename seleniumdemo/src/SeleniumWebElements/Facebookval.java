package SeleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookval
{
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://facebook.com/");
WebElement usernameInputbox=driver.findElement(By.xpath("//input[@name='email']"));
boolean expectedUserInputboxDisplay=true;
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
WebElement passwordInputbox=driver.findElement(By.xpath("//input[@name='pass']"));
boolean expectedPasswordInputboxDisplay=true;
boolean actualPasswordInputboxdisplay=passwordInputbox.isDisplayed();

if(expectedPasswordInputboxDisplay==actualPasswordInputboxdisplay)
{
	System.out.println("password input box displayed");
	
}
else
{
	System.out.println("password input box not displayed");

}
boolean expectedPasswordInputboxenable=true;
boolean actualPasswordInputboxenable=passwordInputbox.isEnabled();
if(expectedPasswordInputboxenable==actualPasswordInputboxenable)
{
System.out.println("password input box enabled");
	
}
else
{
	System.out.println("password input box not enabled");
}
}

}
