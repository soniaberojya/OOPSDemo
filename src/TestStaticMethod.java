
class Student200
	{
		private int rollno;
		private String name;
		static String college = "BMS";
		
		public static void changeCollege(String c)
		{
			college = c;  //static methods can only access static variables not non-static variables
			//rollno = 2;  will give compilation error "Cannot make a static reference to the non-static field rollno"
		}
		public Student200(int r, String n)
		{
			rollno = r;
			name = n;
		}
		public void display()
		{
			System.out.println(rollno+" "+name+" "+college);
		}
	}

public class TestStaticMethod
{
	
	public static void main(String[] args) 
	{
		Student200.changeCollege("SSGMCE");  //call static method without creating object
		
		Student200 s1 = new Student200(101,"Sonia");
		Student200 s2 = new Student200(102,"Mike");
		Student200 s3 = new Student200(103,"John");
		
		s1.display();
		s2.display();
		s3.display();
		
	}

}
