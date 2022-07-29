//Example of Encapsulate

public class Encapsulate
{
	private String studname;
	private int studroll;
	
	public String getStudname()
	{
		return studname;
	}
	
	public void setStudname (String studname)
	{
		this.studname=studname;
	}
	public int getStudroll()
	{
		return studroll;
	}
	public void setStudroll (int studroll)
	{
		this.studroll= studroll;
	}
	
	public static void main(String argss[])
	{
		Encapsulate obj = new Encapsulate();
		obj.setStudname("kalgi");
		obj.setStudroll(1);
		System.out.println("student name is "+obj.studname);
		System.out.println("student rollnumber is "+obj.studroll);
	}
}