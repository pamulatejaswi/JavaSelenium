package seleniumdemo1;

public class Customer implements CreditCards,LoanAcc {

	public static void main(String[] args) 
	{
		CreditCards c1=new Customer();
		c1.customerdetails();
	}
public void loanLim()
{
	System.out.println("loan lim of customer");
}
public void cardBal()
{
	System.out.println("card bal of customer");
}
public void customerdetails()
{
	System.out.println("cust details of customer");

}
}
