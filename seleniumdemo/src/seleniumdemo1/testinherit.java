package seleniumdemo1;

public class testinherit
{
	//int b;
	 int j=funB(10);
	 static int i=5;
	testinherit()
	{
		System.out.println("Hi cons of testinherit");
	}
	int funB(int a)
	{
		System.out.println(i);
		j=a;
		//System.out.println(b);

		System.out.println("Hi of funB");
		System.out.println(j);

		return a;
	}
	static void funC()
	{
		System.out.println(i);

		System.out.println("hi func");
	
	}
	public static void main(String[] args)
	{
		testinherit t1=new testinherit(); 
		t1.funB(10);
		System.out.println(t1.j);
		funC();
	}

}
