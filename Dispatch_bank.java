//Dispatch _bank

class bank
{
	float getRateOfInternet()
	{
		return 0;
	}
}
class SBI extends bank
{
	float getRateOfInternet()
	{
		return 8.4f;
	}
}
class ICICI extends bank
{
	float getRateOfInternet()
	{
		return 7.3f;
	}
}
class AXIS extends bank
{
	float getRateOfInternet()
	{
		return 9.7f;
	}
}
class Dispatch_bank
{
	public static void main (String args[])
	{
		bank b;
		b= new SBI();
		System.out.println("SBI rate of interest:"+b.getRateOfInternet());
		b=new ICICI();
		System.out.println("ICICI rate of interest:"+b.getRateOfInternet());
		b=new AXIS();
		System.out.println("AXIS rate of interest:"+b.getRateOfInternet());
	}
}