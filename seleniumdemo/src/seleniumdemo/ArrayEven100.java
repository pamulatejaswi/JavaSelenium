package seleniumdemo;

public class ArrayEven100 {

	public static void main(String[] args)
	{
		
		int n=101;
		
		int a[]=new int[n];
		
		
		for (int i=1;i<a.length;i++)
		{
			
			a[i]=i;
			if((a[i])%2==0)
			{
				System.out.println(a[i]);
			}

		}
			
		

	}

}
