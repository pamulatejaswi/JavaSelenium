package seleniumdemo;

public class Printodd150to100 {

	public static void main(String[] args) {

		int n=150;
		int k=50;
				
				int a[]=new int[k];
				
				
				for (int i=0;i<k;i++)
				{
					
					a[i]=n;
					if((a[i])%2!=0)
					{
						System.out.println(a[i]);
					}
		n--;
				}
					
		
		
		
		
	}

}
