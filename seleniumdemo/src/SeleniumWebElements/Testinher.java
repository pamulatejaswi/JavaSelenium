package SeleniumWebElements;

public class Testinher extends TestA1{

	
Testinher(int a)
		{
			System.out.println("cons of Testinher");
			System.out.println(a);
		}
public static void main(String[] args) {
			 Testinher t =new Testinher(10);
			 System.out.println("done");
	}

}
