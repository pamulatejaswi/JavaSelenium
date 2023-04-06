package seleniumdemo;

public class Arraydispaly 
{

	public static void main(String[] args)
	{
		
        	int n=100;	
		int a[]=new int[n];
				
		for (int i=0;i<a.length;i++)
		{
			a[i]=n;
			n--;
			System.out.println(a[i]);
			
		}
		
		
	}

}
