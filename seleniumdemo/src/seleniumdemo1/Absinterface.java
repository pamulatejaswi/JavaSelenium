package seleniumdemo1;

public interface Absinterface
{
	
	void funA();
	void funB();
	 default void funC()
	{
		System.out.println("func");
	}
	 static void funD()
	 {
			System.out.println("fund");

	 }
	public static void main(String[] args)
	{
		funD();
	}
	 

}
