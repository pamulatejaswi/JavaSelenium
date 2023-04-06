package seleniumdemo;

import java.util.Scanner;

public class Lesser { 
	
	void funless(int a,int b, int c)
	{
		if(a>b && a>c)
		
System.out.println	("a is big"+a);
		else
			if(b>c)
			{
				System.out.println	("b is big"+b);

			}
			else
			{
				System.out.println	("c is big"+c);

			}
		
	}

	public static void main(String[] args) {

		Lesser l=new Lesser();
				
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");

		int a=s.nextInt();
		System.out.println("enter b number:");

		int b=s.nextInt();
		System.out.println("enter c number");

		int c=s.nextInt();
		 l.funless(a, b,c);
		
		
	}

}
