package seleniumdemo;

public class Vowelstr {

	public static void main(String[] args) {
     String s="rmp";
		
	if(s.contains("a")||s.contains("e")||s.contains("i")||s.contains("o")||s.contains("u"))
	{
		System.out.println("contain vowels");
		//System.out.println("vowels are");

	}
	else
	{
		System.out.println("does not contain vowels");

	}
	char c1[]=s.toCharArray();
	//System.out.println(c1);
	
	char c[]={'e','a','i','o','u'};
	
	for(int i=0;i<c1.length;i++)
		{
		for (int j=0;j<c.length;j++)
		if (c1[i]==c[j])
		{
			System.out.println("vowel"+c[j]);
		}
		
			
	}
	}

}
