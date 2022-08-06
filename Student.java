//Example of This keyword

public class This
{
	int id;
	String name;
	int age;
	
	This()
	{
		System.out.println("Default constructor");
	}
	This(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	This(int i,String n,int j)
	{
		id=i;
		name=n;
		age=j;
	}
	void display()
	{
		System.out.println(id+""+name+""+age);
	}
	
	public static void main(String args[])
	{
		This s3=new This();
		This s1= new This(1,"avc");
		This s2= new This(2,"hbc",20);
		s1.display();
		s2.display();
	}
}