package seleniumdemo1;


public class Testinherit1 extends testinherit
{
	Testinherit1()
	{
		System.out.println("Hi cons of Testinherit1");

	}

	public static void main(String[] args)
	{
		Testinherit1 t1=new Testinherit1();
		
		t1.funA();
		t1.funB(20);
			t1.funC();
	}
	void funA()
	{
		System.out.println("Hi funA");

	}

}
