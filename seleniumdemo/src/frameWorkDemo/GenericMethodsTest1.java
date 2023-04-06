package frameWorkDemo;

public class GenericMethodsTest1
{

	public static void main(String[] args)
	{
		GenericMethods keys=new GenericMethods();
		keys.openBrowser("chrome");
		keys.enterURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		keys.enterData("xpath","//input[@name='username']","Admin");
		keys.enterData("xpath","//input[@name='password']","admin123");
		keys.clickOnElement("xpath", "//button[text()=' Login ']");
	}
	
	}


