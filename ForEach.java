//foreach demo

public class ForEach
{
	public static void main (String args[])
	{
	int[] numbers={1,2,3,4,5};
	int sum=0;
	for (int n:numbers)
	{
		sum=sum+n;
	}
	//{
		//System.out.println(n);
	//}
	System.out.println("sum of array is :"+sum);
   }
}
