package seleniumdemo;

public class Thisdemo {
	int a=10;

	public static void main(String[] args)
	{
Thisdemo t1=new Thisdemo();
System.out.println(t1.a);
t1.funB();
System.out.println(t1.a);

	}
void funA()
{
	a=20;
}
void funB()
{
	System.out.println(a);
	funA();
	System.out.println(a);
	Thisdemo t1=new Thisdemo();
t1.funA();
System.out.println(a);

}
}
