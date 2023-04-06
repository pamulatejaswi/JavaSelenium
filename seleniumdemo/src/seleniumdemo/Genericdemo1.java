package seleniumdemo;

public class Genericdemo1 <K>
{

	public static void main(String[] args) 
	{

		Genericdemo <Double> g1=new Genericdemo <Double >();
		g1.funA(111.245);
		Genericdemo1 <String>g2= new Genericdemo1<String>();
		g2.funB("hi");
		//Genericdemo1 <Integer> g3= new Genericdemo1<Integer>();
		//g3.funC(32);
	}
		
		void funB(K a)
		{
			System.out.println(a);
		}
		//void funC(N b)

		//{
			//System.out.println(b);

		//}
	
	}


