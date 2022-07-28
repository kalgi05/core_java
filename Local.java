//Local Variable

public class Local
{
	public void calculate()
	{
		int height=0;
		
		height=height+170;
		System.out.println("height is:"+height+" cm");
	}
	public static void main(String args[])
	{
		Local a = new Local();
		a.calculate();
	}
}
