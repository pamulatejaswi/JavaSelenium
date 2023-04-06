package seleniumdemo;

public class Staticdemo5a {

	int a=funA();
	static int b =funB();

	public static void main(String[] args) 
	{
new Staticdemo5a();
new Staticdemo5a();
new Staticdemo5a();
	}
	int funA()
	{
		System.out.println("this is funA");
		return 10;
	}
	static int funB()
	{
		System.out.println("funB");
		return 20;

	}

}
