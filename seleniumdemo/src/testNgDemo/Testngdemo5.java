package testNgDemo;

import org.testng.annotations.Test;


public class Testngdemo5 {

	
	@Test (priority=5)
	public void logintest()
	{
	System.out.println("login");	
	System.out.println(0/0);
	}
	
	@Test (priority=6,dependsOnMethods="logintest")
	public void customerdetails()
	{
		System.out.println("customer details");	
	}
	
}
