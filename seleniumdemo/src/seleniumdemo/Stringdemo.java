package seleniumdemo;

public class Stringdemo {

	public static void main(String[] args) 
	{
		
		String a="abc";
		String b="xyz";
		String c="abc";
		String d=new String("abc");
		if (a==b)
		{
			System.out.println("same");
		}
			else
			{
				System.out.println("not same");
				
		}
		
		if(a==c)
		{
			System.out.println("same");
		}
			else
			{
				System.out.println("not same");
				
		
		}
		if(c==d)
		{
			System.out.println("same");
		}
			else
			{
				System.out.println("not same");
				
		
		}
		if(a==d)
		{
			System.out.println("same");
		}
			else
			{
				System.out.println("not same");
				
				}
		if(a.equals(d))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
			
			}
		
		
		
	}

}
