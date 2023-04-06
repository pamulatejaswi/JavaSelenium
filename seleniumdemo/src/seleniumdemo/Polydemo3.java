package seleniumdemo;

public class Polydemo3 {

	public static void main(String[] args) 
	{
		Polydemo3 p3=new Polydemo3();
		p3.funA();
		A k =new A();
			p3.funA(k);
		p3.funA(new A());
		//p3.funA(null);
		B l =new B();
		p3.funA(l);
	p3.funA(new B());
	C m =new C();
	p3.funA(m);
p3.funA(new C());
A n=null;
p3.funA(n);

	}
	void funA()
	{
		
			System.out.println("zero args of funA");
		
	}
	void funA(A a1)
	{
	
			System.out.println("class A args of funA");
			System.out.println(a1);
	
		}
	void funA(B a1)
	{
	
			System.out.println("class B args of funA");
			System.out.println(a1);
	
		}
	void funA(C a1)
	{
	
			System.out.println("class C args of funA");
			System.out.println(a1);
	
		}
}
	
//}
