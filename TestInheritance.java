//test inheritance

class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("animal is barking");
	}
}
class Tiger extends Dog
{
	void hunting ()
	{
		System.out.println("tiger is hunting");
	}
}
public class TestInheritance
{
	public static void main (String args[])
	{
		Animal aobj = new Animal();
		Dog dobj = new Dog();
		Tiger tobj= new Tiger();
		tobj.hunting();
		aobj.eat();
		dobj.bark();
	}
}