package iodemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyDemo1
{
	@Test
	public void fInOutTest() throws IOException
	{
		FileInputStream fin=new FileInputStream("C:\\Users\\abhista\\OneDrive\\Desktop\\FrameworkDemo1\\IODemo\\text1.properties.properties");
		Properties prop=new Properties();
         prop.load(fin);
         String keyvalue=prop.getProperty("browser");
         System.out.println("keyvalue for browser : "+keyvalue);
         

}
}