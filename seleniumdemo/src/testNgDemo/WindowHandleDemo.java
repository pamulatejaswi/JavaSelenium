package testNgDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class WindowHandleDemo
{
	@Test
	public  void windowhandle()   
	{
	ChromeOptions co =new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);	

		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    driver.manage().window().maximize();

		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);

		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		 Set<String> openwindows=driver.getWindowHandles();
		 int windowsize=openwindows.size();
		 System.out.println(windowsize);
		Iterator<String> windowsList=openwindows.iterator();
		//System.out.println(windowsList);

//            String childWindowid=windowsList.next();
//    	    String childWindowid1=windowsList.next();	 
//    	    
//    	    String childWindowid2=windowsList.next();
//
//	   
//    	    String childwindow2=driver.switchTo().window(childWindowid2).getTitle();
//    	   System.out.println(childwindow2);
//    	    
//    	    String childwindow1=driver.switchTo().window(childWindowid1).getTitle();
//     	   System.out.println(childwindow1);

//    	    if(childwindow2.equals("XPath Practice - H Y R Tutorials"))
//    	    {
//            String label= driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();
//            System.out.println(label);
//    	    }        
//    	    else  if(childwindow1.equals("XPath Practice - H Y R Tutorials"))
//    	    {
//            String label= driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();
//            System.out.println(label);
//    	    }  
    	    
    	   // int childwindowid[]=new String[windowsize];
    	  String childwindow[]=new String[windowsize];
    	   
              for(int i=0;i<windowsize;i++)
    	    {
         childwindow[i]=windowsList.next();
    	    
    	    if(driver.switchTo().window(childwindow[i]).getTitle().equals("XPath Practice - H Y R Tutorials"))
                 {
    	    	driver.switchTo().window(childwindow[i]);
    	    	String label= driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();
    	        System.out.println(label);
   	   	     driver.quit(); 

    	       
}
    	    }
	}      
}                
		


