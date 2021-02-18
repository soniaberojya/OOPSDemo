//override demo

class Bank
{
	int getRateOfInterest()
	{
		return 0;
	}
	
}
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return 8;
	}
}
class ICICI extends Bank
{
	int getRateOfInterest()
	{
		return 7;
	}
}
class AXIS extends Bank
{
	int getRateOfInterest()
	{
		return 9;
	}
}


public class OverrideDemo {

	public static void main(String[] args) 
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI rate of Interest: "+s.getRateOfInterest());
		System.out.println("ICICI rate of Interest: "+i.getRateOfInterest());
		System.out.println("AXIS rate of Interest: "+a.getRateOfInterest());
		
		

	}

}
