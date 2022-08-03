// all methods in string class
//string operation
//object representation

public class StringOperation
{
	public static void main (String args[])
	{ 
		StringOperation sobj= new StringOperation();  //sobj holgind adress
		Float x=10.20f;    //wrapper class
		
		String s= " Panchal daval ";
		String s2= "isa good day";
		//String s3="hi";
		//String s4="hello";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.trim());
		System.out.println(s.startsWith("Pa"));
		System.out.println(s.endsWith("l"));
		System.out.println(s.charAt(2));
		System.out.println(s.length());
		System.out.println(s.replace("daval","java"));
		System.out.println(s.concat(s2));
		/*System.out.println(s3.compareTo(s4));
		System.out.println(s3.indexof('a'));
		System.out.println(s.substring(2,6));
		System.out.println(sobj.toString());
		System.out.println(x.toString());*/
		
	}
}	