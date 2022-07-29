//Final Variable

public class FinalVariable
{
	int speedLimit=80;
	
	 void run()
	{
		speedLimit=100;
		System.out.println("speed of bike is"+speedLimit);
	}
	public static void main(String args[])
	{
		FinalVariable obj= new FinalVariable();
		obj.run();
	}
}