package testNgDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TimestampScreenshotReport
{
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest childExtentLogger;
	public static ExtentTest parentExtentLogger;

	@Test
	public void timestampscreenshot() throws IOException
	{

Date d1=new Date();
System.out.println(d1);
SimpleDateFormat s1=new SimpleDateFormat("yyyy MMMM d HH m s");
String newDate=	s1.format(d1);
System.out.println(newDate);
	
	
	File file=new File("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\"+newDate);
	file.mkdir();

		
		ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	
		driver.get("https://www.facebook.com");
	    driver.manage().window().maximize();
	        TakesScreenshot ts= (TakesScreenshot)driver;
		    File source= ts.getScreenshotAs(OutputType.FILE);
		    File targetpath=new File("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\Screenshot\\screen3.png");
		    FileUtils.copyFile(source, targetpath);
		    
		    htmlReporter=new ExtentHtmlReporter("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\"+newDate+"\\test5.html");
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			parentExtentLogger=extent.createTest("test1");
			childExtentLogger=parentExtentLogger.createNode("scenario1");
			childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
			childExtentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\Screenshot\\screen3.png").build());
			extent.flush();
			System.out.println("done");

	}
	
	}




