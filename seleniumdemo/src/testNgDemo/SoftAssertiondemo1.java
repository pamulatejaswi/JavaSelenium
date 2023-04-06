package testNgDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertiondemo1 
{
	@Test
	public void funA()
	{
		System.out.println("funa of SoftAssertiondemo1");
	
	SoftAssert sassert=new SoftAssert();
	sassert.assertEquals("selenium", "selenium");
	System.out.println("log1 complete");
	sassert.assertEquals("selenium", "rbg");
	System.out.println("log2 complete");
	sassert.assertNotEquals("selenium", "rbg");
	System.out.println("log3 complete");
	sassert.assertNotEquals("selenium", "selenium");
	System.out.println("log4 complete");
	sassert.assertAll();


	}
}
