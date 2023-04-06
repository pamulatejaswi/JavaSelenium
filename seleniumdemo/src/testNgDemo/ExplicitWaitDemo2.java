package testNgDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo2 
{

	@Test
	public  void explicitwait()
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
	    driver.manage().window().maximize();

		driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']")).click();
    //WebDriverWait driverwait=new WebDriverWait(driver,30);
    WebDriverWait driverwait=new WebDriverWait(driver,Duration.ofSeconds(30));
    driverwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='ContentHolder_lbModels_10_RBG']")));
        
    driver.findElement(By.xpath("//span[@id='ContentHolder_lbModels_10_D']")).click();
    driver.quit(); 

	}


}
