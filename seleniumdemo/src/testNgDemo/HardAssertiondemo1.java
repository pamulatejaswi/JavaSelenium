package testNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class HardAssertiondemo1 
{
@Test
public void funA()
{
	
	System.out.println("this is funa of HardAssertiondemo1");
	String expecteddata="RBG Technologies";
	String actualdata="RBG Technologies";
	Assert.assertEquals(actualdata, expecteddata);
	System.out.println("funa done");
}
@Test
public void funB()
{
	
	System.out.println("this is funb of HardAssertiondemo1");
	String expecteddata="RBG Technologies";
	String actualdata="selenium";
	Assert.assertEquals(actualdata, expecteddata);
	System.out.println("funb done");
}
@Test
public void funC()
{
	
	System.out.println("this is func of HardAssertiondemo1");
	String expecteddata="RBG Technologies";
	String actualdata="selenium";
	Assert.assertNotEquals(actualdata, expecteddata);
	System.out.println("func done");
}
@Test
public void funD()
{
	
	System.out.println("this is fund of HardAssertiondemo1");
	String expecteddata="RBG Technologies";
	String actualdata="RBG Technologies";
	Assert.assertNotEquals(actualdata, expecteddata);
	System.out.println("fund done");
}
@Test
public void funE()
{
	
	System.out.println("this is fune of HardAssertiondemo1");
	
	Assert.assertTrue(true);
	System.out.println("fune done");
}
@Test
public void funF()
{
	
	System.out.println("this is funf of HardAssertiondemo1");
	
	Assert.assertTrue(false);
	System.out.println("funf done");
}
@Test
public void funG()
{
	
	System.out.println("this is fung of HardAssertiondemo1");
	
	Assert.assertFalse(false);
	System.out.println("fung done");
}
@Test
public void funH()
{
	
	System.out.println("this is funh of HardAssertiondemo1");
	
	Assert.assertFalse(true);
	System.out.println("funh done");
}






}
