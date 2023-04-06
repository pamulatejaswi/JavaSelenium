
public class Stringconcat {

	public static void main(String[] args) {
		String s1="abc";
		String s2="der";
		String s3="";
		String s4=s1+s2;
		System.out.println(s4);
		
		for (int i=s4.length()-1;i>=0;i--)
		{
			 s3=s3+s4.charAt(i);
		}
			System.out.println(s3);

	}

}
