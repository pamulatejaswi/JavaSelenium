package testNgDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WebtableAllDataprint 
{
	@Test
	public  void webtablecolumn() 
	{
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://www.bseindia.com/markets/equity/EQReports/mktwatchR.html?filter=gainer*all$all$");
	    driver.manage().window().maximize();

		List<WebElement> columns=driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/thead/tr/td"));
	     int columncount= columns.size();
	     System.out.println(columncount);
	     
	     List<WebElement> rows=driver.findElements(By.xpath("//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr"));
	     int rowcount= rows.size();
	     System.out.println(rowcount);
			
		String xpath1="//*[@id='fontSize']/div[2]/div/div[1]/div/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[";
	     String xpath2="]/td[";
	     String xpath3=	"]";
	     for(int i=1;i<=rowcount;i++)
	     {
	    	 for(int j=1;j<=columncount;j++)
	    	 {
	    	String xpath=xpath1+i+xpath2+j+xpath3;
	    	
	  	     String data1=driver.findElement(By.xpath(xpath)).getText();
 		     System.out.print(data1+" "); 
	     }
 		     System.out.println(" "); 

	     }	
	     driver.quit(); 

		
	}
}
