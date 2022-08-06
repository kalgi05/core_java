//MethodOverloading

class MethodOverloading
{
	void display()
	{
		System.out.println("empty display method");
	}
	void display(double i)
	{
		System.out.println("display method with double data type as parametrer");
	}
	void display(int i,double x)
	{
		System.out.println("display method with int and double data type as parametrer");
	}
	void display(double i , int x)
	{
		System.out.println("display method with int and double data type as parametrer");
	}
	public static void main (String args[])
	{
		MethodOverloading m1 = new MethodOverloading();
		m1.display();
		m1.display(5);
		m1.display(3,5.6);
		m1.display(4.3,2);
	}
}