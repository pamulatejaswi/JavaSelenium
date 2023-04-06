package seleniumdemo1;

public class Test9 
{

	public static void main(String[] args) throws Exception
	{
funA(9);
	}
	static void funA(int a) throws Exception 
	{
		if(a>=10)
		{
			System.out.println("accept the number");
		}
		else
			
		{
			throw new Exception();
		}
		System.out.println("done");
	}

}
