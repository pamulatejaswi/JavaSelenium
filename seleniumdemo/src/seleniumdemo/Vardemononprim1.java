package seleniumdemo;

public class Vardemononprim1
{
	int  k=3;
	Vardemononprim1(int k)
	{
		k=k;
		System.out.println(k);

	}
	
	public static void main(String[] args)
	{
		
	Vardemononprim1 m1=new Vardemononprim1(2);
A a= new A();
A a1= new A();

B b=new B();
m1.funnonprim(a, b);
System.out.println(m1.k);
m1.main();
	}
	void main()
	{
		System.out.println("hi main");
	}
	void funnonprim(A a,B b)
	{
			
		System.out.println(a.i+b.i);
		System.out.println(a.j+b.j);
		a.funA();
		b.funB();

	}

}
