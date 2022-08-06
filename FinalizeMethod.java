//The Finalize() method 

//package finalize;

public class Finalize
{
	
	public static void main (String args[])
	{
		Finalize tobj= new Finalize();
		tobj= null;
		System.gc();
		System.out.println("object is destroyed successfully");
	}
	
	protected void Finalize()
	{
		System.out.println("performing cleanup before destroyed the object");
	}
}