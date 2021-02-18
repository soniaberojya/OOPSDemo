import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(new Student2(111,"John",29));
		al.add(new Student2(222,"Mike",21));
		al.add(new Student2(555,"Mary",26));
		
		for(Student2 st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		System.out.println("After Sorting");
		
		Collections.sort(al);
		for(Student2 st:al)
			System.out.println(st.rollno+" "+st.name+" "+st.age);
				

	}

}
