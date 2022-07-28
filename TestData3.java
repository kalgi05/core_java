//write a java program to display the pattern like right angle triangle with a number

import java.util.Scanner;
public class TestData3
{
	public static void main(String args[])
	{
		int i,j,n;
		System.out.println("input number:");
		
		Scanner in= new Scanner(System.in);
		n=in.nextInt();
		
		for (i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			  System.out.println(j);
		  
		 System.out.println("");
		 
		}
	}
}
