//Method Override

class A
{
	void display()
	{
		System.out.println("display in A");
	}
}
class B extends A
{
	void display()
	{
		System.out.println("display in B");
	}
}

class methodOverride
{
	public static void main (String args[])
	{
		A oa= new A();
		oa.display();
		B ob= new B();
		ob.display();
	}
}