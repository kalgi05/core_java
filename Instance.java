//Instance Variable

public class Instance
{
	public int rollNum;
	public String name;
	public int totalmarks;
	public int number;
	
	public static void main(String args[])
	{
		Instance in= new Instance();
		in.rollNum=10;
		in.name="kalgi";
		in.totalmarks=300;
		in.number=4;
		
		System.out.println(in.rollNum);
		System.out.println(in.name);
		System.out.println(in.totalmarks);
		System.out.println(in.number);
	}
}
	