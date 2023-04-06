package seleniumdemo;

public class Objdemouse2 {
	static int a=10;
	int b=2;
	
	public static void main(String[] args) {
    		Objdemouse2 o1=new Objdemouse2();
		o1.fun1();
		Objdemouse2 o2=new Objdemouse2();

		o2.fun1();

		Objdemouse2 o3=new Objdemouse2();

		o3.fun1();

	
	}
	
	void fun1()
	{
		
		a=a+b;
		b=b+1;
		//int a=1;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	

}
