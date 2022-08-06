//Scanner Class example

import java.util.Scanner;

public class ScannerClass
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		/*System.out.println("enter your name");
		String name =input.next();
		System.out.println("my name is :"+name);
		input.close*/
		
		System.out.println("enter number");
		int number =input.nextInt();
		System.out.println("number is :"+number);
		input.close();
	}
}