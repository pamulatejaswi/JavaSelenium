package ddfwdemo1;

import org.testng.annotations.Test;

public class DataProviderDemo2 
{
	@Test(invocationCount=5)
	public void funA()
	{
		System.out.println("funa of data provider demo2");
	}
	
}
