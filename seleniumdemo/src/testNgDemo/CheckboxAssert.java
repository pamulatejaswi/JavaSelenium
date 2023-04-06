package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CheckboxAssert
{
 @Test
 public void checkbox()
	{
				ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
		
			driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		    driver.manage().window().maximize();

WebElement checkbox3G=driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));

			boolean expectedCheckboxdisplay= true;
boolean actualCheckboxdisplay=checkbox3G.isDisplayed();
SoftAssert s=new SoftAssert();
s.assertEquals(expectedCheckboxdisplay, actualCheckboxdisplay);


boolean expectedCheckboxenable=true;
boolean actualCheckboxenable=checkbox3G.isEnabled();
s.assertEquals(expectedCheckboxenable, actualCheckboxenable);



boolean actualCheckboxselected=checkbox3G.isSelected();
boolean expectedCheckboxselected=false;
s.assertEquals(actualCheckboxselected, expectedCheckboxselected);


checkbox3G.click();

boolean expectedCheckboxselected1=true;
boolean actualCheckboxselected1=checkbox3G.isSelected();
s.assertEquals(expectedCheckboxselected1, actualCheckboxselected1);
s.assertAll();
driver.quit(); 


	}

}



