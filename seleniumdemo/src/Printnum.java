
public class Printnum {
	int i=0;

	public static void main(String[] args) 
	{
		
		Printnum p=new Printnum();
		p.print();
	}
void print()
{
		int k=i+1;
	System.out.println(k);
	i=i+1;
	print();		
}

	}


