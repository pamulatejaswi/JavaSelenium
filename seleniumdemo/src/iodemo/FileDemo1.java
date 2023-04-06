package iodemo;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileDemo1 
{
	@Test
	public void fInOutTest() throws IOException
	{
	File file=new File("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\abc");
	file.mkdir();
	System.out.println("done");
	File file1=new File("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\x\\y\\z");
	file1.mkdir();
	file1.mkdirs();
	System.out.println("done");
 
	}
	
}
