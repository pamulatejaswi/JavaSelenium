package seleniumdemo;

public class Vardemo2 {

	public static void main(String[] args)
	{
		char a[]={'a','b','c'};
		char b[]={'d','e','f'};
		
		char c[]=new char[6];
		
		for(int i=0;i<a.length;i++)
		{
					
					
			c[i]=a[i];
			
						
			System.out.print(c[i]);
		}
			
			for (int j=b.length;j<b.length+1;j++)
			{
				for (int k=0;k<b.length;k++)
				{
				c[j]=b[k];
				
			System.out.print(c[j]);
			}

			}
		
		}
		
	}

	


