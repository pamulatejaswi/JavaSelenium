package seleniumdemo;

public class RecursiveNumberPrint 
{
	int a=10;
	public static void main(String[] args)
	{
		RecursiveNumberPrint r=new RecursiveNumberPrint();
		r.print();
	}
	void print()
	{
		a=a+1;
		System.out.println("print : "+a);
		if(a<20)
		print();
	}	
	}


