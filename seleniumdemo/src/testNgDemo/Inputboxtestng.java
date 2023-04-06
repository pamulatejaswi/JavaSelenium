package testNgDemo;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class Inputboxtestng
	{
		@Test
		public  void funa()
		{
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);	
	SoftAssert a=new SoftAssert();
	driver.get("https://facebook.com/");
    driver.manage().window().maximize();

	WebElement usernameInputbox=driver.findElement(By.xpath("//input[@name='email']"));
	boolean expectedUserInputboxDisplay=true;
	boolean actualUserInputboxdisplay=usernameInputbox.isDisplayed();

//	if(expectedUserInputboxDisplay==actualUserInputboxdisplay)
//	{
//		System.out.println("user name input box displayed");
//		
//	}
//	else
//	{
//		System.out.println("user name input box not displayed");
//
//	}
	a.assertEquals(expectedUserInputboxDisplay, actualUserInputboxdisplay, "UserInputbox Displayed");
	boolean expectedUserInputboxenable=true;
	boolean actualUserInputboxenable=usernameInputbox.isEnabled();
//	if(expectedUserInputboxenable==actualUserInputboxenable)
//	{
//	System.out.println("user name input box enabled");
//		
//	}
//	else
//	{
//		System.out.println("user name input box not enabled");
//	}
	a.assertEquals(expectedUserInputboxenable, actualUserInputboxenable, "user name inputbox enabled");

	WebElement passwordInputbox=driver.findElement(By.xpath("//input[@name='pass']"));
	boolean expectedPasswordInputboxDisplay=true;
	boolean actualPasswordInputboxdisplay=passwordInputbox.isDisplayed();
	a.assertEquals(actualPasswordInputboxdisplay, expectedPasswordInputboxDisplay, "password inputbox displayed");
	a.assertEquals(actualPasswordInputboxdisplay, expectedPasswordInputboxDisplay, "password inputbox displayed");

//	if(expectedPasswordInputboxDisplay==actualPasswordInputboxdisplay)
//	{
//		System.out.println("password input box displayed");
//		
//	}
//	else
//	{
//		System.out.println("password input box not displayed");
//
//	}

	boolean expectedPasswordInputboxenable=true;
	boolean actualPasswordInputboxenable=passwordInputbox.isEnabled();
	a.assertEquals(actualPasswordInputboxenable, expectedPasswordInputboxenable, "password inputbox enabled");
a.assertAll();
driver.quit(); 

//	if(expectedPasswordInputboxenable==actualPasswordInputboxenable)
//	{
//	System.out.println("password input box enabled");
//		
//	}
//	else
//	{
//		System.out.println("password input box not enabled");
//	}
	}

	}



