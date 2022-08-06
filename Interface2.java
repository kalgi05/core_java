//Interface can be Extended

interface A
{
	void method1();
	void method2();
}

interface B extends A
{
	void method3();
}

 class Myclass implements B
{
	public void method1()
	{
		System.out.println("implements method1");
	}
	public void method2()
	{
		System.out.println("implements method2");
	}
	public void method3()
	{
		System.out.println("implements method3");
	}
}

public class Interface2
{
	public static void main (String args[])
	{
		Myclass my= new Myclass();
		my.method1();
		my.method2();
		my.method3();
	}
}
