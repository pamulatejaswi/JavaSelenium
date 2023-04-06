package seleniumdemo;

public class Test10 
{

	public static void main(String[] args)
	{
int a[]={10,20,33,44,78};
int k=a.length;
System.out.println(k);
int b[]=new int[k];

for (int i=0;i<a.length;i++)
{
	b[i]=a[k-1];
	System.out.println(b[i]);
	k--;
}

	}

}
