//Static variable

public class StaticVariable
{
	static int a=10;
	int b=40;
  
    public void display()
	{
		a=a+10;
		b=b+10;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
public static TestStaticVariable
{
	public static void main (String args[])
	{
         TestStaticVariable obj1= new TestStaticVariable();
		 TestStaticVariable obj2=new TestStaticVariable();
		obj1.display();
		obj2.display();
	}
}