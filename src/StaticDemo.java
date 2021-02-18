
public class StaticDemo 
{
	static int count;
	//int count;
	StaticDemo()
	{
		count = count +1;
	}
	static void display()
	{
		System.out.println("The no. of objects Created is: "+count);
	}

	public static void main(String[] args) 
	{
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		StaticDemo.display(); //ideal/recommended format
		//s3.display(); also valid
		//display();  also valid

	}

}
