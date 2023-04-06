package SeleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttoncheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		boolean actualdisplayButton=button.isDisplayed();
		//System.out.println(actualdisplayButton);
		boolean expectedDisplayButton=true;
		if(expectedDisplayButton==actualdisplayButton)
		{
			System.out.println("button dispalyed");
		}
		else
		{
			System.out.println("button not dispalyed");

		}
		boolean actualenableButton=button.isEnabled();
		System.out.println(actualenableButton);
		boolean expectedenablebutton=true;
		if(expectedenablebutton==actualenableButton)
		{
			System.out.println("button enabled");
		}
		else
		{
			System.out.println("button not enabled");

		}
		WebElement actualbuttonText=driver.findElement(By.xpath("//button[text()='Log in']"));
		String expectedbuttonname="Login In";
				if(expectedbuttonname.equals(actualbuttonText))
				{
					System.out.println("login button name same");
				}
				else
				{
					System.out.println("login button name not same");
				}
			button.click();
				
				
	}

}
