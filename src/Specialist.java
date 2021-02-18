
public class Specialist extends Doctor 
{
	protected String Speciality;
	
	Specialist(final String str, final int num, final String addr, final String special)
	{
		super(str,num,addr);  //invoking base class constructor
		Speciality = special;
	}
	
	void display()
	{
		super.display(); //call base method
		System.out.println("The speciality is:"+Speciality);

	}

}
