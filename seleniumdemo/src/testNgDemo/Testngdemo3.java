package testNgDemo;

import org.testng.annotations.Test;

public class Testngdemo3 {
	@Test(priority=0)
	public void funC()
	{
		System.out.println("func of testng demo3");

	}
	@Test(priority=3)
	public void funD()
	{
		System.out.println("fund of testng demo3");

	}
	@Test(priority=2)
	public void funA()
	{
		System.out.println("funa of testng demo3");

	}
	@Test(priority=1)
	public void funB()
	{
		System.out.println("funb of testng demo3");

	}
}
