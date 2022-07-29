//Final Method

class Tvs
{
	int speedlimit=80;
	void run()
	{
		System.out.println("speed of bike is"+speedlimit);
	}
}
public class FinalMethod extends Tvs
{
	void run()
	{
		System.out.println("Speed of bike is "+speedlimit);
	}
	public static void main (String args[])
	{
		FinalMethod obj = new FinalMethod();
		obj.run();
	}
}