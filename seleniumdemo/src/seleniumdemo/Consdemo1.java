package seleniumdemo;

public class Consdemo1
{
	Consdemo1()
	{
		int a=10;
		System.out.println(a);

		System.out.println("cons");
	}
	

	public static void main(String[] args)
	{
		new Consdemo1();
		System.out.println("main");
		//new Consdemo1();
		//Consdemo1 c1=new Consdemo1();
		//c1.Consdemo1();
	}

}
