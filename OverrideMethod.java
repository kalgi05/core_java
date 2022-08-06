//override method

class Vehicle
{
	void ride()
	{
		System.out.println("vehicle is riding");
	}
}

class Car extends Vehicle
{
	void ride()
	{
		System.out.println("car is riding");
	}
}

public class OverrideMethod
{
	public static void main(String args[])
	{
		Car cobj= new Car();
		cobj.ride();
		vehicle vobj= new Vehicle();
		vobj.ride();
	}
}