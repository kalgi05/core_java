//example of Inheritance

class Animal
{
	void eat()
	{
		System.out.println("animal is eating food");
		
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
public class Inheritance
{
	public static void main(String args[])
	{
		Animal aboj= new Animal();
		Dog dobj= new Dog();
		aboj.eat();
		dobj.bark();
	}
}