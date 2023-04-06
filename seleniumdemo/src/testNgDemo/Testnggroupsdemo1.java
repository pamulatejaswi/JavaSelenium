package testNgDemo;

import org.testng.annotations.Test;

public class Testnggroupsdemo1
{
	@Test(groups="sanity")
	public void funA()
	{
		System.out.println("funa of testng group");

	}
	@Test(groups="sanity")
	public void funB()
	{
		System.out.println("funb of testng group");

	}
	@Test(groups="regression")
	public void funC()
	{
		System.out.println("func of testng group");

	}
	@Test(groups="regression")
	public void funD()
	{
		System.out.println("fund of testng group");

	}
}
