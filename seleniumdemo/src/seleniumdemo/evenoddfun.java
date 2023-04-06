package seleniumdemo;

public class evenoddfun
{
	
	public static void main(String[] args)
	{
   int a=2345;
  int esum=0;
  int osum=0;
  int i=0;
  while(a!=0)
  {
  i=a%10;
  
  if(i%2==0)
  {
	  esum=esum+i;
			  
  }
  
  else 
	  if(i%2!=0)
  {
	  osum=osum+i;
  }
  a=a/10;
  }
  System.out.println(esum);
  System.out.println(osum);
	}}

	
	
		
	
	


