package testNgDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationdemo4 
{
	 @Test
	  public void funA()
	  {
		  System.out.println("funA of TestngAnnotationdemo4");
	  }
	 @BeforeMethod 
	  public void beforeMethod() 
	  {
		  System.out.println("before method of TestngAnnotationdemo4");
	  }

	  @AfterMethod
	  public void afterMethod()
	  {
		  System.out.println("after method of TestngAnnotationdemo4");

	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println("before class of TestngAnnotationdemo4");
	 
	  }

	  @AfterClass
	  public void afterClass()
	  {
		  System.out.println("after class of TestngAnnotationdemo4");

	  }

	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("before test of TestngAnnotationdemo4");

	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("after test of TestngAnnotationdemo4");

	  }

	  @BeforeSuite
	  public void beforeSuite() 
	  {
		  System.out.println("before suite of TestngAnnotationdemo4");

	  }

	  @AfterSuite
	  public void afterSuite()
	  {
		  System.out.println("after suite of TestngAnnotationdemo4");

	  }

	}



