package seleniumdemo;

public class Staticdemo5 
{
	int a=funA();
	static int b =funB();

	public static void main(String[] args) 
	{
System.out.println("main method");
Staticdemo5 s1=new Staticdemo5();
s1.funA();

System.out.println(s1.a);

System.out.println("done");

	}
	int funA()
	{
		System.out.println("this is funA");
		System.out.println(a);
		return 10;
	}
	static int funB()
	{
		System.out.println("funB");
		System.out.println(b);

		return 20;

	}
	
}
