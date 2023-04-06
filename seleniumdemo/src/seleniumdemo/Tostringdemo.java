package seleniumdemo;

public class Tostringdemo {
int a=10;
String s1="RBG technologies";
	public static void main(String[] args) 
	{
System.out.println("main method start");
Tostringdemo t1=new Tostringdemo();

System.out.println(t1);
System.out.println("done");
	}
	public String toString()
	{
		System.out.println("toString of Tostringdemo1");
		return s1+" "+a;
		
	}

}
