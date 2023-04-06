package seleniumdemo1;

public class Abschilddemo1 extends Absdemo1
{

	public static void main(String[] args) 
	{

	Abschilddemo1 a1=new Abschilddemo1();
	a1.funA();
	a1.funB();
		a1.funC();	
		
	}
	 void funA()
	{
	System.out.println("funa");	
	}
	 
	 void funB()
		{
		System.out.println("funb");	
		}
	 void funC()
	 {
			System.out.println("funC child");	

	 }

}
