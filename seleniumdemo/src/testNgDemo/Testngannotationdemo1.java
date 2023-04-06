package testNgDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Testngannotationdemo1
{
  @Test
  public void funA()
  {
	  System.out.println("funA of Testngannotationdemo1");
  }
  @Test
  public void funB()
  {
	  System.out.println("funB of Testngannotationdemo1");
  }
  
  @BeforeMethod 
  public void beforeMethod() 
  {
	  System.out.println("before method of Testngannotationdemo1");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("after method of Testngannotationdemo1");

  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("before class of Testngannotationdemo1");
 
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("after class of Testngannotationdemo1");

  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("before test of Testngannotationdemo1");

  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test of Testngannotationdemo1");

  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("before suite of Testngannotationdemo1");

  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("after suite of Testngannotationdemo1");

  }

}
