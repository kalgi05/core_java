//Scanneer Classs
//HasNext

import java.util.Scanner;

public class ScannerClass2
{
	public static void main(String args[])
	{
		String name="kalgi 10 20 30";
		Scanner sc= new Scanner(name);
		String s1= sc.next();
		System.out.println("name is"+s1);
		
		int number =sc.nextInt();
		System.out.println("number1 is:"+number);
		
		int number2=sc.nextInt();
		System.out.println("number2 is"+number2);
		
		
		/*while(SC.hasNext())
		{
			System.out.println(SC.next());
		}*/
		
		sc.close();
	}
}