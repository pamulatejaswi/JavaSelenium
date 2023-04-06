package seleniumdemo;

public class Polydemo2 {

	public static void main(String[] args) {
Polydemo2 p1=new Polydemo2();
p1.funA(10504578961l,20567789896l);
	}
	void funA(int  a,int b)
	{
		System.out.println("int,int args of funA");
	}
void funA(long a,long b)
{
	System.out.println("long,long args of funA");

}
void funA(long a, int b)
{
	System.out.println("long,int args of funA");

}
void funA(int a,long b)
{
	System.out.println("int,long args of funA");

}
void funA(double a, int b)
{
	System.out.println("double,int args of funA");

}
void funA(double a, double b)
{
	System.out.println("double,double args of funA");

}

}
