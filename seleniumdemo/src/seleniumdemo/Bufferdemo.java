package seleniumdemo;

public class Bufferdemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer s1=new StringBuffer("abc");
StringBuffer s2=new StringBuffer("def");
s2=s1;
System.out.println(s1);
System.out.println(s2);

if(s1==s2)
	
System.out.println("same");
else
	System.out.println("diff");

	}

}
