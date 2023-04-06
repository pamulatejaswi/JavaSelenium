package ddfwdemo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


 public class DataProviderDemo5 
{
	
	@Test(dataProvider="setData")
	public void datademo(String a,String b)
	{
	ChromeOptions co =new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);	
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(a);

	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(b);

	driver.findElement(By.xpath("//button[text()=' Login ']")).click();	
	String expectedouput="Invalid credentials";
	String actualoutput=driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
	Assert.assertEquals(actualoutput, expectedouput);
	}
		
	@DataProvider 
	public Object[][] setData()
	{
		Object[][] o1=new Object[3][2];
		o1[0][0]="Admin";
		o1[0][1]="admin123";
		o1[1][0]="rbg";
		o1[1][1]="rbg";
		o1[2][0]="tejaswi";
		o1[2][1]="abcde";
		
		return o1;

	}
}
