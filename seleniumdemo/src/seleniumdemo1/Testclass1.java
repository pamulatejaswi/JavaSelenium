package seleniumdemo1;

public class Testclass1 implements TestE,TestC
{
	public static void main(String[] args)
	{
	Testclass1 t1=new Testclass1();
	t1.funA();
	//System.out.println(k);
	t1.funB();
	t1.funC();
	t1.funD();
	t1.funE();
	
	}
	public void  funA()
	{
		System.out.println("iam funa");
		//return "hi";

	}
	public void funB()
	{
		System.out.println("iam funb");
		funA();
	
	}
	public void funC()
	{
		System.out.println("iam func");

	}
	/**public void funD(int a)
	{
		a=5;
		System.out.println(a);

		System.out.println("iam fund");

	}*/
	public void funE()
	{
		System.out.println("iam fune");
}
	@Override
	public void funD() {
		System.out.println("iam fund");		
	}
}

