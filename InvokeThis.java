// this to invoke current class method

public class InvokeThis
{
	int id;
	String name;
	int age;
	
	InvokeThis()
	{
		System.out.println("default ");
	}
	InvokeThis(int id,String name)
	{
		
		this.id=id;
		this.name=name;
	}
	InvokeThis(int i,String n ,int j)
	{
		id=i;
		name=n;
		age=j;
	}
	void display()
	{
		System.out.println(id+""+name);
	}
	
	void message()
	{
		display();
	}
	
	public static void main (String args[])
	{
		InvokeThis s3= new InvokeThis();
		InvokeThis s1= new InvokeThis(1,"kalgi");
		InvokeThis s2= new InvokeThis(1,"kalgi",20);
			s1.display();
			s2.display();
			s1.message();
	}
}
		