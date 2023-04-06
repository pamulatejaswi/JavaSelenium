package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardasset3rdparameter 
{
	@Test
	public void funA()
	{
		
		System.out.println("this is funa of Hardasset3rdparameter");
		String expecteddata="RBG Technologies";
		String actualdata="RBG Technologies";
		Assert.assertEquals(actualdata, expecteddata,"funa error");
		System.out.println("funa done");
	}
	@Test
	public void funB()
	{
		
		System.out.println("this is funb of Hardasset3rdparameter");
		String expecteddata="RBG Technologies";
		String actualdata="selenium";
		Assert.assertEquals(actualdata, expecteddata,"funb error");
		System.out.println("funb done");
	}
	@Test
	public void funC()
	{
		
		System.out.println("this is func of Hardasset3rdparameter");
		String expecteddata="RBG Technologies";
		String actualdata="selenium";
		Assert.assertNotEquals(actualdata, expecteddata,"func error");
		System.out.println("func done");
	}
	@Test
	public void funD()
	{
		
		System.out.println("this is fund of Hardasset3rdparameter");
		String expecteddata="RBG Technologies";
		String actualdata="RBG Technologies";
		Assert.assertNotEquals(actualdata, expecteddata,"fund error");
		System.out.println("fund done");
	}
	@Test
	public void funE()
	{
		
		System.out.println("this is fune of Hardasset3rdparameter");
		
		Assert.assertTrue(true);
		System.out.println("fune done");
	}
	@Test
	public void funF()
	{
		
		System.out.println("this is funf of Hardasset3rdparameter");
		
		Assert.assertTrue(false);
		System.out.println("funf done");
	}
	@Test
	public void funG()
	{
		
		System.out.println("this is fung of Hardasset3rdparameter");
		
		Assert.assertFalse(false);
		System.out.println("fung done");
	}
	@Test
	public void funH()
	{
		
		System.out.println("this is funh of Hardasset3rdparameter");
		
		Assert.assertFalse(true);
		System.out.println("funh done");
	}

}



