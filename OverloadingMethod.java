//Method Overloading

public class OverloadingMethod
{
	void add()
	{
		System.out.println("empty method");
	}
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add (double a , double b,double c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main (String args[])
	{
		OverloadingMethod ov = new OverloadingMethod();
		ov.add();
		ov.add(10,20);
		ov.add(2.0,3.0,4.0);
	}
}