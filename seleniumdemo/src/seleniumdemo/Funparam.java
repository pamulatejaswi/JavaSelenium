package seleniumdemo;

public class Funparam
{

	public static void main(String[] args) 
	{
		
		System.out.println("hi");
		
	Funparam f1= new Funparam();
	System.out.println(f1.paramFun(10, 20));
	
	}
	
	 int paramFun(int a, int b)
	{
		
		int c= a+b;
		return c;
		
				
	}

}
