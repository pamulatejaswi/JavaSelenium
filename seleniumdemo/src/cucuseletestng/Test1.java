package cucuseletestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Test1 
{
	@Test
	public void google() throws Throwable
	{
//		ChromeOptions co= new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(co);
//		driver.get("https://www.amazon.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//div[@id='nav-packard-glow-loc-icon']")).click();
//		Thread.sleep(2000);
//		WebElement  dropdown=driver.findElement(By.xpath("//span[@role='radiogroup']"));
//		dropdown.click();
//		
		File f=new File("C:\\Users\\abhista\\OneDrive\\Desktop\\a.txt");
		//FileInputStream read=new FileInputStream(f);
		f.createNewFile();
		
	FileOutputStream fout=new FileOutputStream(f);
	int s=55;
	fout.write(s);
	byte[] b={62,83};
	fout.write(b);
	FileInputStream fin=new FileInputStream(f);
	System.out.println(fin);
	
		 
	}
	
	

}
