
public class TesterDemo {

	public static void main(String[] args) 
	{
		Tester t1 = new Tester(101,"John",2000.00f);
		
		System.out.println(t1); //invoke toString() method in Tester class
		
		System.out.println(t1.eid+" "+t1.name+" "+t1.sal);
	}

}
