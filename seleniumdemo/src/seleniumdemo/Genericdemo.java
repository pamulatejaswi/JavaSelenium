package seleniumdemo;

public class Genericdemo <P>
{


	public static void main(String[] args) 
	{
		
Genericdemo <Double> g1=new Genericdemo <Double >();

g1.funA(111.245);
Genericdemo1 <String> g2= new Genericdemo1<String>();

g2.funB("hi");

	}
void funA(P g1)
{
	System.out.println(g1);
	
}


	}


