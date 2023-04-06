package seleniumdemo;

public class Arraydemo 
{
	

	public static void main(String[] args)
	{
	//	int a[][] = new int[2][2];
		//int b[][]=new int[2][2];
		int c[][]=new int[2][2];
		//a[0][0]=1;
		//a[0][1]=2;
		//a[1][0]=1;
		//a[1][1]=2;
		//b[0][1]=1;
		//b[1][1]=2;
		//b[0][0]=1;
		//b[0][1]=2;
int a[][]={{1,2},{3,4}};
int b[][]={{1,2},{3,4}};

		
	 for (int i=0; i<a.length;i++)
	 {
		 for (int j=0;j<b.length;j++)
		 
		 
		 {
			 c[i][j]=a[i][j]+b[i][j];
		 
		 System.out.println(c[i][j]);
		 }
	 }
	 
 }
				
}	
