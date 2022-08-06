//Show the usage of final keyword

package ;

final class Tvs
{
	final int speedlimit=80;
	 final void run()
	 {
		 System.out.println("speed of bike is "+speedlimit);
	 }
}
public class bike extends Tvs{
	void run()
	{
		System.out.println("speed of bike is"+speedlimit);
	}
	public static void main(String args[])
	{
		bike obj=new bike();
		obj.run();
	}
}
