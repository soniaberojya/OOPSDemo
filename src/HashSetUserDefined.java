import java.util.HashSet;
import java.util.Set;

public class HashSetUserDefined 
{

	public static void main(String[] args) 
	{
		Set<Employee1> empset= new HashSet<Employee1>();//employee - user defined object/type
		Employee1 e1 = new Employee1(100,"John",5000);
		Employee1 e2 = new Employee1(101,"Mike",7000);
		Employee1 e3 = new Employee1(102,"Ral",7000);
		Employee1 e4 = new Employee1(103,"John",5000);
		
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		
		for(Employee1 e:empset)
		{
			System.out.println(e.id+" "+e.name+" "+e.sal);
		}
		

	}

}
