
public class Methodoverload1 {
int i=10;
	public static void main(String[] args) 
	{
		Methodoverload1 m1=new Methodoverload1();
		m1.funA(10);
	}
		//void funA()
		//{
		//	System.out.println("zero args");
		//}

		int funA()
		{
			
			System.out.println(i);	
			System.out.println("int args");
			return 5;

		}
		void funA(long l)
		{
			System.out.println(i);	
			System.out.println("long args");

	}

}
