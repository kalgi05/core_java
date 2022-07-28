//Static Block

public class StaticBlock1
{
	static int a=3;
	static int b;
	static int x;
	
	static void math()
	{
		System.out.println("x:"+x);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
	
	static
	{
		System.out.println("static block initialized");
		b=a*4;
	}
	public static void main (String args[])
	{
		math(42);
	}
}