package seleniumdemo1;

public class Test8 
{

public static void main(String[] args)
{
try
{
	System.out.println(10/0);
}
catch(Exception e)
{
	throw new NullPointerException();
}
finally
{
	System.out.println("done");
}

}

}
