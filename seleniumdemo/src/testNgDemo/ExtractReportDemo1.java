package testNgDemo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtractReportDemo1 
{
		public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static ExtentTest childExtentLogger;
		public static ExtentTest parentExtentLogger;
		@Test
		public  void testReport() 
		{
			htmlReporter=new ExtentHtmlReporter("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\ExtractReport\\test1.html");
			extent=new ExtentReports();
			extent.attachReporter(htmlReporter);
			parentExtentLogger=extent.createTest("test1");
			childExtentLogger=parentExtentLogger.createNode("scenario1");
			childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
			extent.flush();
			System.out.println("done");
			
			
		

}
}
