
public class ThisDemo 
{
	int instVar;
	ThisDemo(int instVar)
	{
		this.instVar = instVar;
		System.out.println("this reference"+this);
	}

	public static void main(String[] args)
	{
		ThisDemo obj = new ThisDemo(8); //invoke constructor
		System.out.println("object reference" +obj);

	}

}
