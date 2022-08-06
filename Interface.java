//Interface

interface Animal
{
	void eat();
}
interface Dog
{
	void bark();
}

class Tiger implements Animal,Dog
{
	void hunting()
	{
		System.out.println("tiger is ready for hunting");
	}
	 public void eat()
	{
		System.out.println("Animal is eating");
	}
	 public void bark()
	{
		System.out.println("Dog is barking");
	}
}

public class Interface
{
	public static void main (String args[])
	{
		Tiger tobj = new Tiger();
		tobj.hunting();
		tobj.bark();
		tobj.eat();
	}
}
