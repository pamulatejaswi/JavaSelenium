package testNgDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampDemo1
{

	public static void main(String[] args)
	{
Date d1=new Date();
System.out.println(d1);
SimpleDateFormat s1=new SimpleDateFormat("yyyy MMMM d HH m s");
String newDate=	s1.format(d1);
System.out.println(newDate);
	}

}
