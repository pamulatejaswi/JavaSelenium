package seleniumdemo;

public class Odemo6A 
{
	int x=4;
	A a1=new A();
	Odemo6A d1;
	
	public static void main(String[] args) 
	{
System.out.println("main method start");
Odemo6A d1=new Odemo6A();
System.out.println(d1);

System.out.println(d1.x);
System.out.println(d1.d1);

d1.d1 =new Odemo6A();
d1.d1.d1= new Odemo6A();
int x=6;
d1.d1.d1.x=x;
d1.d1.d1.d1=d1;
d1.d1.d1.d1.x=13;
System.out.println(d1.d1.d1.d1);
System.out.println(d1);
	
		
		
	}

}
