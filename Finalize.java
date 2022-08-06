//The Finalize() method 

//package Finalize;

public class Finalize
{
	protected void Finalize()
	{
		System.out.println("performing cleanup before destroyed the object");
	}


	public static void main (String args[])
	{
		Finalize tobj= new Finalize();
		tobj= null;
		System.gc();
		System.out.println("object is destroyed successfully");
	}
	
	
}