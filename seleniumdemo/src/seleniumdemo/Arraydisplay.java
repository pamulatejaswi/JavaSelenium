package seleniumdemo;

public class Arraydisplay {

	public static void main(String[] args)	
	{
	
	
int a[]={3,4,5,1,2};
int b[]=new int[a.length];
int j=a.length-1;

for (int i=0;i<a.length;i++)
{
 
	b[i]=a[j];
	j--;
	
	System.out.println(b[i]);
	
}
				
	}
	}	
		
			
	


