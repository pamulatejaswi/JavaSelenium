package testNgDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationdemo3 
{
	 @Test
	  public void funA()
	  {
		  System.out.println("funA of Testngannotationdemo3");
	  }
	
	  
	  @BeforeMethod 
	  public void beforeMethod() 
	  {
		  System.out.println("before method of Testngannotationdemo3");
	  }

	

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println("before class of Testngannotationdemo3");
	 
	  }

	 
	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("before test of Testngannotationdemo3");

	  }

	  @BeforeSuite
	  public void beforeSuite() 
	  {
		  System.out.println("before suite of Testngannotationdemo3");

	  }

	}



