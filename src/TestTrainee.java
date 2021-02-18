import java.util.Scanner;

class Trainee                  //  instance Class declaration
{
	int tId;                  // properties
	String tName;
	String technology;
	float salary,stipend;
	void input()              //method   
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id, Name, Technology & Salary of a trainee :");
		tId = s.nextInt();
		tName = s.next();
		technology = s.next();
		salary = s.nextFloat();
	}
	float calculate()
	{
		stipend = salary-200;
		return stipend;
	}
	void display()
	{
		System.out.println("********Trainee Details********");
		System.out.println("Trainee Id : "+tId);
		System.out.println("Trainee Name : "+tName);
		System.out.println("Trainee technology : "+technology);
		System.out.println("Trainee Salary : "+salary);
	}

}


public class TestTrainee {          // main class declaration

	public static void main(String[] args) 
	{
		Trainee t1 = new Trainee();
		Trainee t2 = new Trainee();
		
		t1.input();     //method call
		t2.input();
		
		float s1 = t1.calculate();
		float s2 = t2.calculate();
		
		t1.display();
		System.out.println("Stipend : "+s1);
		t2.display();
		System.out.println("Stipend : "+s2);
	}

}
