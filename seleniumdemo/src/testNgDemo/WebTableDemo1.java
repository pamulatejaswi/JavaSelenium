package testNgDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebTableDemo1 
{
	@Test
	public  void Webtable() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
	    driver.manage().window().maximize();

		WebElement element1=driver.findElement(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td[1]"));
		String data= element1.getText();
		System.out.println(data);
	     List<WebElement> allrows=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr"));
	     int rowcount= allrows.size();
	     System.out.println(rowcount);
	     
	     List<WebElement> allcolumns=driver.findElements(By.xpath("//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[1]/td"));
	     int columncount= allcolumns.size();
	     System.out.println(columncount);
	     
	     String xpath1="//*[@id='post-body-6522850981930750493']/div[1]/table/tbody/tr[";
	     String xpath2="]/td[";
	     String xpath3="]";
	     for(int i=1;i<=rowcount;i++)
	     {
	    	 for (int j=1;j<=columncount;j++)
	    	 {
	    		String xpath=xpath1+i+xpath2+j+xpath3;
	    		System.out.println(xpath);
	    		String data1=driver.findElement(By.xpath(xpath)).getText();
	    		System.out.println(data1);
	   	     driver.quit(); 

	    	 }
	     }
	     
	     
	     
	}		
}
