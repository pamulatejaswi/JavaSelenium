package seleniumdemo;

public class Equalcompare {
	int funequal(int a,int b)
	{
		if(a<b)
		
			return a;
		else
			return b;
		
	}

	public static void main(String[] args) {

		Equalcompare l=new Equalcompare();
		int k= l.funequal(4, 2);
		System.out.println(k);		
		

	
	
	}

}
