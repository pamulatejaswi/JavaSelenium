package testNgDemo;

public class TypeCastDemo1 {

	public static void main(String[] args)
	{
TestA t1=new TestB();//upcasting
//TestB t2=new TestA();//compile time error
//TestB t2=(TestB)new TestA();//runtime error
//TestB t3=t1;//compile error
TestB t3=(TestB)t1;//downcasting
System.out.println("done");
	}

}
