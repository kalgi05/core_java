// Static Method

class StaticMethod
{
	static int a=10;
   public void display()
	{
		a=a+20;
	}
}

public class TestStaticMethod
{
	public static void main (String args[])
	{
		System.out.println("helo world");
		StaticMethod.display();
		System.out.println("a:"+StaticMethod.a);
		StaticMethod obj= new StaticMethod();
		obj.display();
		System.out.println("a:"+StaticMethod.a);
	}
}
