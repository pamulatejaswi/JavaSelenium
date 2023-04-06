package seleniumdemo1;

public class Test6 {

	public static void main(String[] args)
	{
Test6 t1=new Test6();
t1.funA();
	}
int funA()
{
	System.out.println("funA of Test6");
	return funA();
}
}
