package seleniumdemo1;

public class Absclass implements AbsInterface1
{

	public static void main(String[] args)
	{
Absclass a=new Absclass();
a.funA();
a.funB();
a.funC();
//a.funD();
	}
	

	@Override
	public void funA() {
		
System.out.println("funa");	
	}

	@Override
	public void funB() {
		System.out.println("funb");	

	}

}
