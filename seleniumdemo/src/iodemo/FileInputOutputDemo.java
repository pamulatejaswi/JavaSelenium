package iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileInputOutputDemo 
{
	@Test
	public void fInOutTest() throws IOException
	{
	FileOutputStream fout=new FileOutputStream("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\test1.txt");
	//FileInputStream fin=new FileInputStream("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\test2.txt");
	File file=new File("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\test3.txt");
	file.createNewFile();
	System.out.println("done");
	
	}
	

}
