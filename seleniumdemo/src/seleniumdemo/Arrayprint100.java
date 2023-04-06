package seleniumdemo;

public class Arrayprint100 {

	public static void main(String[] args)
	{

		int n=100;
		int k=51;
		
		int a[]=new int[k];
		for(int i=0;i<k;i++)
		{
			a[i]=n;
			n++;
			System.out.println(a[i]);
		}
		
		
		
		
	}

}
