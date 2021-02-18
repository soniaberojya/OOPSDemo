
public class ContactNumber {
	public void createContact(String name, long num)
	{
		System.out.println("name= "+name+" "+"number= "+num);
		System.out.println("\n");
	}
	
	public void createContact(String name, long num1, long num2)
	{
		System.out.println("name= "+name+" "+"number1 = "+num1+" "+"number2 = "+num2);
		System.out.println("\n");	
	}
	
	

	public static void main(String[] args) 
	{
		ContactNumber person1 = new ContactNumber();
		ContactNumber person2 = new ContactNumber();
		
		person1.createContact("abc",1234567890L);
		person2.createContact("defg",1111111111L,2222222222L);
		
		

	}

}
