package seleniumdemo;

public class Stringrev
{

	public static void main(String[] args)
	{
		
		String s="im a professional";
		char c[]=s.toCharArray();
	

		int l=s.length()-1;
		char c1[]=new char[s.length()];

		
		for (int i=0; i<s.length();i++)
		{
			c1[i]=c[l];
			l--;
			System.out.print(c1[i]);
			
		
		}

	}

	

}
