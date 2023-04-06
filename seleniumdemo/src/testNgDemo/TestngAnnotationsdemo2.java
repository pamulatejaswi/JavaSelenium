package testNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestngAnnotationsdemo2
{
	
	 @Test
	  public void funA()
	  {
		  System.out.println("funA of Testngannotationdemo2");
	  }
	  @AfterMethod
	  public void afterMethod()
	  {
		  System.out.println("after method of Testngannotationdemo2");

	  }

	 
	  @AfterClass
	  public void afterClass()
	  {
		  System.out.println("after class of Testngannotationdemo2");

	  }

	 

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("after test of Testngannotationdemo2");

	  }

	 
	  @AfterSuite
	  public void afterSuite()
	  {
		  System.out.println("after suite of Testngannotationdemo2");

	  }

	}



