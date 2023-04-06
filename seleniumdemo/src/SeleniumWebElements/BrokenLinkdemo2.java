package SeleniumWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinkdemo2 {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);

		driver.get("file:///C:/Users/abhista/Downloads/link2.html");
		WebElement link=driver.findElement(By.tagName("a"));
		String actualLink= link.getAttribute("href");
		if(actualLink.equals(""))
		{
			System.out.println("link is broken");
			
		}
		else
		{
			System.out.println("link is working fine");
		}


	}

}
