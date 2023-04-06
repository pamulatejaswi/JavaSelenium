package testNgDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testngdemo4 {
	@Test
	public void funA()
	{
		System.out.println("funa of testng demo4");

	}
	@Test
	public void funB()
	{
		System.out.println("funb of testng demo4");
  System.out.println(0/0);
	}
	@Test
	public void funC() throws Exception
	{
		System.out.println("func of testng demo4");
//throw new Exception();
		throw new SkipException("this is skip exception");
	}
	@Test(enabled=false)
	public void funD()
	{
		System.out.println("fund of testng demo4");

	}
	

}
