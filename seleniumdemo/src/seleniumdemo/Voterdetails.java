package seleniumdemo;

public class Voterdetails extends Throwable 
{
public static void votertest(int age) 
{
	if(age>=18)
	{
		System.out.println("valid voter");
	}
	else
	{
		System.out.println("not valid voter");
	
		
    try
    {
    	throw new VoterAgeException();
    	}
    catch(Throwable e)
    {
    	System.out.println("new VoterAgeException");
    }
	}
	
}

}
