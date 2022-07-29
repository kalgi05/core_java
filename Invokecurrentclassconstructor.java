// This (): to invoke current class constructor

public class Invokecurrentclassconstructor
{
	
	int id;
	String name;
	int age;
	
	
   Invokecurrentclassconstructor()
	{
		System.out.println("default ");
	}
	Invokecurrentclassconstructor(int id,String name)
	{
		 this();
		this.id=id;
		this.name=name;
	}
	Invokecurrentclassconstructor(int i,String n ,int j)
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
		this.display();
	}
	
	public static void main (String args[])
	{
		Invokecurrentclassconstructor s3= new Invokecurrentclassconstructor();
        //InvokeThis s1= new InvokeThis(1,"kalgi");
		Invokecurrentclassconstructor s2= new Invokecurrentclassconstructor(1,"kalgi",20);
			//s1.display();
			s2.display();
			//s1.message();
	}
}