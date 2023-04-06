package SeleniumWebElements;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

	public class Checkboxdemo2
	{

	public static void main(String[] args) 
			{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
			
	driver.get("https://www.calculator.net/mortgage-calculator.html");
	WebElement includeCheckbox=driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[6]/td/label/span"));
	boolean actualCheckboxdisplay=includeCheckbox.isDisplayed();
	boolean expectedCheckboxdisplay= true;

	if(expectedCheckboxdisplay==actualCheckboxdisplay)
	{
		System.out.println("checkbox displayed");
	}
	else
	{
		System.out.println("checkbox not displayed");
	}
	boolean actualCheckboxenable=includeCheckbox.isEnabled();
	boolean expectedCheckboxenable=true;

	if(expectedCheckboxenable==actualCheckboxenable)
	{
		System.out.println("checkbox enabled");
	}
	else
	{
		System.out.println("checkbox not enabled");
	}
	WebElement includeCheckbox1=driver.findElement(By.xpath("//input[@name='caddoptional']"));

	
	boolean actualincludeCheckboxselected=includeCheckbox1.isSelected();
	boolean expectedCheckboxselected=true;
	
	if(expectedCheckboxselected==actualincludeCheckboxselected)
	{
		System.out.println("checkbox  selected");
	}
	else
	{
		System.out.println("checkbox not selected");
	}
	includeCheckbox.click();

	boolean actualincludeCheckbox1afterclickisselected=includeCheckbox1.isSelected();
	boolean expectedCheckboxafterclickselected1=false;

	if(expectedCheckboxafterclickselected1==actualincludeCheckbox1afterclickisselected)
	{
		System.out.println("after click checkbox not selected");
	}
	else
	{
		System.out.println("after click checkbox  selected");
	}

		}

	}


