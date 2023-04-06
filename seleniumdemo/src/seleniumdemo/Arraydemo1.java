package seleniumdemo;

public class Arraydemo1
{

	public static void main(String[] args) 
	{
		char a[]={'a','b','h','i'};
		char b[]={'j','a','y'};
		char c[]=new char[7];
		
		c[0]=a[0];
		c[1]=a[1];
		c[2]=a[2];
		c[3]=a[3];
		c[4]=b[0];
		c[5]=b[1];
		c[6]=b[2];
		
		System.out.print(c[0]);
		System.out.print(c[1]);
		System.out.print(c[2]);
		System.out.print(c[3]);
		System.out.print(c[4]);
		System.out.print(c[5]);
		System.out.print(c[6]);
	

//System.out.print(c[0],c[1]);
		
		
		
	}

}
