//Dynamic Method Dispatch

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
		System.out.println("display in b");
	}
}

class Dispatch
{
	public static void main (String args[])
	{
		A oa=new A();
		B ob= new B();
		oa.display();
		ob.display();
		
		oa=ob;
		oa.display();
	}
}