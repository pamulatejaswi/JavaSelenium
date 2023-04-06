package seleniumdemo;

public class Staticdemo 
{
	int i=10;
	static int j=20;

	public static void main(String[] args) 
	{
		System.out.println(j);

		int j=30;
		Staticdemo s1=new Staticdemo();
		System.out.println(s1.i);
		
		System.out.println(Staticdemo.j);

		System.out.println(j);

		

	}

}
