package seleniumdemo;

public class Palindromestr {

	public static void main(String[] args) {
 String ABS="teja";
 String a="";
 for (int i=ABS.length()-1;i>=0;i--)
 {
	 a=a+ABS.charAt(i);
 }
 System.out.println(a);
		if(a.equals(ABS))
			System.out.println("palindrome");
		else
			
			System.out.println("not");

		
	}

}
