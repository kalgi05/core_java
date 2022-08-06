import java.util.Scanner;

public class Main{
	public static void main(String args[])
	{
		String name="10 20.3 ankit";
		Scanner sc= new Scanner(name);
		String s1= sc.next();
	   System.out.println("nameis"+" " +s1);
	   
		int number = sc.nextInt();
		System.out.println("number is "+" "+number);
		
		 double d = sc.nextDouble();
		System.out.println("double value is" +" "+d);
		
		sc.close();
	}
}