package seleniumdemo;

public class fundemo2 {

	public static void main(String[] args) {
		int a=20;
		System.out.println(a);
		
		fundemo2 f1= new fundemo2();
		f1.funb();
		int c= f1.funb();
		int d = a+c;
		
		System.out.println(d);
		float e =f1.func();
		
		float k=e+ (float) a+ (float) d;
		System.out.println(k);
		fund();

	}
	int funb()
	{
		int b=10;
		
		return b;
		//System.out.println(b);
			//.out.println("hi");
	}
float func()
{
	float t=(float)30.45;
	return t;
		
}
static void fund()
{
	System.out.println("hi");
	return ;
}
}
