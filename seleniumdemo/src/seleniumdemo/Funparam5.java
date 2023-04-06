package seleniumdemo;

public class Funparam5 {

	public static void main(String[] args) {	
		int grosssal=5000;
		Funparam5 f5= new Funparam5();
		//f5.expense();
		
		int totalsal= grosssal+f5.expense();
		System.out.println(totalsal);
	}
		
		
		int expense()
		{
			int rent=1000;
			int pf=2000;
			int  exp= rent+pf;
			//System.out.println(exp);
			return exp;
			
		}
		
		
		
		
	}


