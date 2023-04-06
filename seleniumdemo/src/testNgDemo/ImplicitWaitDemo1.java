package testNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ImplicitWaitDemo1 
{

	@Test
	public  void implicitwait() throws InterruptedException
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
			driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).click();
  
    driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_Bluetooth_D']")).click();
  driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']")).click();

  driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_11_D']")).click();
  driver.quit(); 

	}
}
