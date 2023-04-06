package seleniumdemo;

public class Odemo8A {
	void fun1(A a1)
	{
		System.out.println(a1);
		if(a1!=null)
		{
			a1.i=a1.i+1;
			a1.j=a1.j+2;
		}
		System.out.println(a1.i);
		System.out.println(a1.j);

		System.out.println("end");

	}

	public static void main(String[] args)
	{
Odemo8A d1=new Odemo8A();
A k1=new A();
d1.fun1(k1);

int a1=20;
//d1.fun1(a1);


	}

}
