
class Doctor 
{
	protected String name;
	protected int idNumber;
	protected String address;
	Doctor()   //default constructor
	{
		
	}
	
Doctor(final String str,final int num,final String addr)    //parameterized constructor //final means fix
{
	name = str;
	idNumber = num;
	address = addr;	
}
void display()
{
	System.out.println("Name is :"+name);
	System.out.println("Number is :"+idNumber);
	System.out.println("Address is :"+address);
}
}




