public class Student2 implements Comparable<Student2>
{
	int rollno;
	String name;
	int age;

	public Student2(int rollno, String name, int age)
	{
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	
	
	public int compareTo(Student2 st)  //not writing this section will give exception(error
	{
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
			
	}

}
