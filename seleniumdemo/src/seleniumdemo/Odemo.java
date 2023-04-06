package seleniumdemo;

public class Odemo {

int x,y;
void fun1()
{
	x=x+1;
	Odemo d1=new Odemo();
	d1.x=x+2;
}
		
		
public static void main(String[] args) {
		Odemo d1=new Odemo();
		d1.fun1();
		System.out.println(d1.x);
				
		
	}

}
