package SeleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Checkboxdemo1 {

public static void main(String[] args) 
		{
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
		
			driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
			WebElement checkbox3G=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));

			boolean expectedCheckboxdisplay= true;
boolean actualCheckboxdisplay=checkbox3G.isDisplayed();
if(expectedCheckboxdisplay==actualCheckboxdisplay)
{
	System.out.println("checkbox displayed");
}
else
{
	System.out.println("checkbox not displayed");
}
boolean expectedCheckboxenable=true;
boolean actualCheckboxenable=checkbox3G.isEnabled();
if(expectedCheckboxenable==actualCheckboxenable)
{
	System.out.println("checkbox enabled");
}
else
{
	System.out.println("checkbox not enabled");
}

boolean actualCheckboxselected=checkbox3G.isSelected();
boolean expectedCheckboxselected=false;

if(expectedCheckboxselected==actualCheckboxselected)
{
	System.out.println("checkbox not selected");
}
else
{
	System.out.println("checkbox  selected");
}
checkbox3G.click();

boolean expectedCheckboxselected1=true;
boolean actualCheckboxselected1=checkbox3G.isSelected();

if(expectedCheckboxselected1==actualCheckboxselected1)
{
	System.out.println("checkbox selected");
}
else
{
	System.out.println("checkbox not selected");
}

	}

}
