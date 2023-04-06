package testNgDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Alertboxdemo 
{
	@Test
	public  void alerttest3() throws InterruptedException
	{
	ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String data=driver.findElement(By.xpath("//div[@id='output']")).getText();
		System.out.println("alert popop after clicking ok : "+data);
		
driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
alert.accept();
String data1=driver.findElement(By.xpath("//div[@id='output']")).getText();
System.out.println("alert popop after clicking ok : "+data1);

driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
alert.dismiss();
String data2=driver.findElement(By.xpath("//div[@id='output']")).getText();
System.out.println("alert popop after clicking cancel : "+data2);

driver.findElement(By.xpath("//button[@id='promptBox']")).click();
Thread.sleep(3000);

alert.sendKeys("tejaswi");
Thread.sleep(5000);
alert.accept();
String data3=driver.findElement(By.xpath("//div[@id='output']")).getText();
System.out.println("alert text after entering name : "+data3);
driver.quit(); 

	}
}
