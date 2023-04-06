package seleniumdemo;

public class Methodoverload {

	public static void main(String[] args) {
Methodoverload m1=new Methodoverload();
m1.funwt(12.5,0.05);
//System.out.println(m1.funwt(43.0,10.05));

//System.out.println(m1.funwt(10, 5));

	}
void funwt(double kg,double gm)
{
	double totalwt= kg+gm;
	System.out.println( totalwt);
	
}
void funwt(int kg, int gm)
{
	int netwt= kg+gm;
	System.out.println(netwt);
}
 
		
}
