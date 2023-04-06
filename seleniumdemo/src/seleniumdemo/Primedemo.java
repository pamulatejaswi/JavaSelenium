package seleniumdemo;

public class Primedemo 
{
	public static void main(String[] args) 
	{
		int flag=0;
		int a=15;
		if(a==0||a==1)
		{
		System.out.println("not prime");
		}
		else
		{
		
	for(int i=2;i<a/2;i++)
		{
		if (a%i==0)
		{
			System.out.println("not prime");
			flag=1;
			break;
		}
				
	}
		
	if(flag==0)
		System.out.println("prime");
		}//else
	}//main
		}	//class
						
		
		
	
	
	
	
	
	

