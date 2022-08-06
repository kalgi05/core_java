//understnding the problem without this keyword

class WithoutThis
{
	int rollno;
	String name;
	float fee;
	
	WithoutThis (int rollno,String name,float fee)
	{
		rollno=rollno;
		name=name;
		fee=fee;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "=fee);
	}
}
	
	public class TestThis1
	{
		public static void main (String args[])
		{
			WithoutThis s1= new WithoutThis(111,"ankit",50000);
			WithoutThis s2= new WithoutThis(222,"abc",30000);
			s1.display();
			s2.display();
		}
	}
