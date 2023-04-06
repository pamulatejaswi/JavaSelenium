

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;


public class Seleniumdemo1 {

	public static void main(String[] args) {

//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhista\\OneDrive\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

//System.setProperty("webdriver.gecko.driver","C:\\Users\\abhista\\OneDrive\\Desktop\\selenium\\geckodriver-v0.32.2-win32 (1)\\geckodriver.exe");
//WebDriver driver1=new FirefoxDriver();
//System.setProperty("webdriver.edge.driver", "C:\\Users\\abhista\\OneDrive\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");
//WebDriver driver2=new EdgeDriver();
WebDriver driver=new ChromeDriver();

//driver.get("https://demo.guru99.com/test/newtours/");
//driver.get("https://google.com/");
//driver.findElement(By.name("userName")).sendKeys("tejaswi");
//driver.findElement(By.name("password")).sendKeys("1234");
//driver.findElement(By.className("gLFyf")).sendKeys("rbh");
//driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("rbg");
//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("4567");
driver.get("https://www.bing.com/");
//driver.findElement(By.id("sb_form_q")).sendKeys("tejaswi");
driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("4567");


	}

}

