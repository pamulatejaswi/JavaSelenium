package seleniumdemo;

public class Order {

	public static void main(String[] args)
	
	{
		Order o=new Order();
		o.funorder();
	}
		void funorder()
		{
		int a[]={1,3,2,4};
		
		//int b[]=new int[4];
		int temp;
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
		if(a[i]>a[j])
		{
			temp= a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
			
			}
			System.out.println(a[i]);

		
							
		}
		}
				
		
		}
		

		
	
	


