// write a java program that takes a number from the user and generate an integer between 1 and 7 and display the name of the weekday.

import java.util.Scanner;
public class TestData
{
	public static void main(String args[])
	{
	 Scanner in = new Scanner(System.in);
	 System.out.println("enter numbers:");
	 int day = in.nextInt();
	
	System.out.println(getDayName(day));
}
	public static String getDayName(int day)
		{
			String dayname="";
				switch (day)
				{
					case 1:
					dayname = "monday";
					break;
					
					case 2:
					dayname= "tuesday";
					break;
					
					case 3:
					dayname = "wednesday";
					break;
					
					case 4:
					dayname = "thursday";
					break;
					
					case 5:
					dayname= "friday";
					break;
					
					case 6:
				    dayname = "saturday";
					break;
					
					case 7:
					dayname = "sunday";
					break;
					
					default:
					 dayname="Invalid Day";
				}
				
				return dayname;
		}
 
}
	
