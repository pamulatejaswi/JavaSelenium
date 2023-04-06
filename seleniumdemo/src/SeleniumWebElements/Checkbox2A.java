package SeleniumWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2A
{

	public static void main(String[] args) {
		
				//WebDriver driver=new ChromeDriver();
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
			
		driver.get("https://www.calculator.net/mortgage-calculator.html");
		WebElement includeCheckbox=driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span"));
		boolean expectedCheckboxdisplay= true;
		boolean actualCheckboxdisplay=includeCheckbox.isDisplayed();
		if(expectedCheckboxdisplay==actualCheckboxdisplay)
		{
			System.out.println("checkbox displayed");
		}
		else
		{
			System.out.println("checkbox not displayed");
		}
		boolean expectedCheckboxenable=true;
		boolean actualCheckboxenable=includeCheckbox.isEnabled();
		if(expectedCheckboxenable==actualCheckboxenable)
		{
			System.out.println("checkbox enabled");
		}
		else
		{
			System.out.println("checkbox not enabled");
		}

		
		boolean actualCheckboxselected=includeCheckbox.isSelected();
		boolean expectedCheckboxselected=true;
		if(expectedCheckboxselected==actualCheckboxselected)
		{
			System.out.println("checkbox selected");
		}
		else
		{
			System.out.println("checkbox not selected");
		}
		includeCheckbox.click();

		boolean actualCheckboxselected1=includeCheckbox.isSelected();
		boolean expectedCheckboxselected1=false;

		if(expectedCheckboxselected1==actualCheckboxselected1)
		{
			System.out.println("checkbox not selected");
		}
		else
		{
			System.out.println("checkbox  selected");
		}

			}

	
	}
