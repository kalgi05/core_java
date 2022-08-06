//variable argument(VARAGS) 														 ... (syntax of variable argument) 

public class Varags
{
	static void fun (String s, int ... a) 						//it should always be last argument nd only one varags is use
	{
		System.out.println("string is :"+" "+s);
		System.out.println("number of argument " +a.length);
		for (int i :a)
		{
			System.out.println(i+" ");
			
		}
	}
	
	public static void main (String args[])
	{
		fun ("hi",100);
		fun("hello",1,2,3,4);
		fun ("java");
	}
}