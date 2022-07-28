//constructor overloading

class ConsructorOverloading
{
	int id;
	String name;
	int age;
	
    ConsructorOverloading(int i,String n)
	{
		id =i;
		name=n;
	}
	 ConsructorOverloading (int i,String n,int a)
	 {
		 id=i;
		 name=n;
		 age=a;
	 }
	 
	 void display()
	 {
		 System.out.println(id+ ""+name+""+age);
	 }
	 
	 public static void main(String args[])
	 {
		 ConsructorOverloading c1=new ConsructorOverloading(111 ,"kalgi");
		 ConsructorOverloading c2 = new ConsructorOverloading(222,"abc",20);
		 c1.display();
		 c2.display();
	 }
}