// program where this keyword is not reqquire

class This_is_not_required
{
	int rollno;
	String name;
	float fee;
	
	 This_is_not_required(int r,String n,float f)
	{
		rollno=r;
		name=n;
		fee=f;
	}
	
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}
	
	public class TestThis3
	{
		public static void main (String args[])
		{
			This_is_not_required s1= new This_is_not_required(111,"ankit",50000);
			This_is_not_required s2= new This_is_not_required(222,"abc",30000);
			s1.display();
			s2.display();
		}
	}