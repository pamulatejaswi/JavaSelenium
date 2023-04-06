package seleniumdemo;

public class Printodd100to150 {

	public static void main(String[] args) {

	int n=100;
		
		int a[]=new int[50];
		
		
		for (int i=0;i<a.length;i++)
		{
			
			a[i]=n;
			if((a[i])%2!=0)
			{
				System.out.println(a[i]);
			}
n++;
		}
			
		
		
	}

}
