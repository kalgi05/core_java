//Wrapper class ( which contains premitive data types )
// combine collection of class together 														- Meaning of wrapper class

public class WrapperClass
{
	public static void main (String args[])
	{
       
	    Byte b= new Byte(100);
	    System.out.println("b object ="+b);				//auto boxing (wrapper class object into premitive data type)
		
		/*Short s = new Short ((short)2459);
		System.out.println("s object="+s);
		
		 Integer a = new Integer((integer)26);
		System.out.println("a object="+a);
		
		Float f = new Float((float)25.7f);
		System.out.println("f object="+f); */
		
		System.out.println("max value of byte ="+Byte.MAX_VALUE);
		System.out.println("min value of byte ="+Byte.MIN_VALUE);
		
		
	}
}