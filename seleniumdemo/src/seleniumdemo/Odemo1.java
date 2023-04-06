package seleniumdemo;

public class Odemo1 {
	
	int x,y;
	void fun1()
	{
		x=x+1;
		A a1= new A();

		a1.i=9;
		System.out.println(a1.i);

	}

	public static void main(String[] args) {
		Odemo1 d1=new Odemo1();
		d1.fun1();
		A a1=new A();
		System.out.println(a1.i);
		

	}

}
