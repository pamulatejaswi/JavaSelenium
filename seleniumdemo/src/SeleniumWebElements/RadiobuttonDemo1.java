package SeleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadiobuttonDemo1 
{

	public static void main(String[] args) {
			ChromeOptions co =new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(co);
			
			driver.get("https://demo.guru99.com/test/newtours/reservation.php");
			WebElement RadioButton=driver.findElement(By.xpath("(//input[@name='tripType'])[2]"));
			boolean actualradiobuttonisdisplayed=RadioButton.isDisplayed();
			boolean expectedradiobuttonisdisplayed=true;
			if(actualradiobuttonisdisplayed==expectedradiobuttonisdisplayed)
			{
				System.out.println("radiobutton is displayed");
			}

			else
			{
				System.out.println("radiobutton is not displayed");
			}

			boolean actualradiobuttonisenabled=RadioButton.isEnabled();
			boolean expectedradiobuttonenabled=true;
			if(actualradiobuttonisenabled==expectedradiobuttonenabled)

			{
				System.out.println("radiobutton is enabled");
			}
			else
			{
				System.out.println("radiobutton is not enabled");

			}
			boolean beforeclickactualradiobuttonisselected=RadioButton.isSelected();
			boolean beforeclickexpectedradiobuttonisselected=false;
			if(beforeclickactualradiobuttonisselected== beforeclickexpectedradiobuttonisselected)
			{
				System.out.println("before click radiobutton is not selected");
			}
			else
			{
				System.out.println("before click radiobuttonis  selected");
			}
			RadioButton.click();

			boolean afterclickactualradiobuttonselected=RadioButton.isSelected();
			boolean afterclickexpectedradiobuttonisselected=true;
			if(afterclickactualradiobuttonselected==afterclickexpectedradiobuttonisselected)
			{
				System.out.println("after click radio button is selected");
			}
			else
			{
				System.out.println("after click radio button is not selected");

			}







		}


	}


