
public class Bike {

	final int speedlimit=90;//final variable
	void run()
	{
		//speedlimit=400;
		System.out.println("SPEED LIMIT IS :"+speedlimit);
	}

	 public static void main(String[]args)
	 {
		 Bike obj = new Bike();
		 obj.run();
	 }
}
