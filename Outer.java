//Outer class

public class Outer
{
	private String greeting="hi";
	class Inner
	{
		int repeat=3;
		void go()
		{ 
			for (int i=0;i<repeat;i++)
			{
				System.out.println(greeting);
			}
		}
	}
	public void callInner()
	{
		Inner iobj= new Inner();
		iobj.go();
	}
	public static void main (String args[])
	{
		Outer o= new Outer();
		o.callInner();
	}
}