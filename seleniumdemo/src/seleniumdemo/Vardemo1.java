package seleniumdemo;

public class Vardemo1

{
	//int x=1;
	void funA(Vardemo1 v1)
	{
		System.out.println(v1);
		
	}
	
	

	public static void main(String[] args)
	{
		Vardemo1 v1=new Vardemo1();
		Vardemo1 k1=new Vardemo1();
		
		v1.funA( k1);
		System.out.println(v1);
		System.out.println(k1);

		 //A k1=new A();
		 //v1.funA(k1);
		//System.out.println(v1);
		
		

	}

}
