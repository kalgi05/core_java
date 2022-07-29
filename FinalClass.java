//Final class

final class Tvs
{
	final int speedlimit=50;
	final void run()
	{
		System.out.println("speed of bike is "+speedlimit);
	}
}
public class FinalClass extends Tvs{
	void run()
	{
		System.out.println("speed of bike is "+speedlimit);
	}
	public static void main (String args[])
	{
		FinalClass obj = new FinalClass();
		obj.run();
	}
}