package seleniumdemo;

public class Privatedemo2 
{
	private Privatedemo2()
	{
		System.out.println("cons of privatedemo2");
	}
	private int a=10;
	Privatedemo2(int a)
	{
		this();
		//System.out.println(a);

	}
	
	private void funA()
	{

		System.out.println("funA");
		
	}
	 void funB()
	{
		System.out.println("funB");
		System.out.println(a);
funA();

	}



}
