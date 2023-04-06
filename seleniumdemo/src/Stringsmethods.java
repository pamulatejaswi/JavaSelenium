
public class Stringsmethods {

	public static void main(String[] args) {
String s1="tejaswi pamula";

int charcount=s1.length();
System.out.println(charcount);


char charArray[]=s1.toCharArray();
System.out.println(charArray[0]);
System.out.println(charArray[1]);

System.out.println(charArray[2]);


String strArray[]=s1.split("a");
System.out.println(strArray[0]);
System.out.println(strArray[1]);
System.out.println(strArray[2]);
//System.out.println(strArray[3]);

//System.out.println(s1.split("a"));



System.out.println(strArray.length);

char c1=s1.charAt(2);

System.out.println(c1);

System.out.println(s1.replace(" ","u"));
s1="tejaswi pamula";
System.out.println(s1.split("a",4)[0]);

System.out.println(s1.split("a",4)[1]);
System.out.println(s1.split("a",4)[2]);
System.out.println(s1.split("a",4)[3]);

System.out.println(s1.substring(2,5	));
	}

}
