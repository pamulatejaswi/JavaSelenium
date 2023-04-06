package SeleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkbox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][3]"));
	
		boolean ActualCheckboxIsDisplayed = checkbox.isDisplayed();
		boolean ExpectedcheckBoxisDisplayed=true;
		if(ExpectedcheckBoxisDisplayed==ActualCheckboxIsDisplayed)
		{
			System.out.println("checkBox   is Displayed");
		}
		else
		{
			System.out.println("checkBox   is not Displayed");

		}
		boolean actualcheckboxisEnabled1=checkbox.isEnabled();
		boolean expectedcheckBoxisEnabled1=true;
		if(expectedcheckBoxisEnabled1==actualcheckboxisEnabled1)
		{System.out.println("Check is Enabled");
		}
		else
		{
			System.out.println("Check is not Enabled");

		}
		boolean actualchechox3Gisselected=checkbox.isSelected();
		boolean expectedchechox3Gisselected=false;
		if(expectedchechox3Gisselected==actualchechox3Gisselected)
		{
			System.out.println("Check is not Selected");
		}
		else 
		{
			System.out.println("Check is Selected");
		}
		checkbox.click();

		boolean actualcheckbox3GaAfterclickisselected=checkbox.isSelected();
		boolean expectedcheckbox3GaAfterclickisselected=true;
		if(expectedcheckbox3GaAfterclickisselected==(actualcheckbox3GaAfterclickisselected))
		{
			System.out.println("After click is selected");
		}
		else
		{
			System.out.println("After click is  not selected");
		}

	

	}

}

	


