
public class Tester 
{
	
	int eid;
	String name;
	float sal;
	public Tester(int eid, String name, float sal) {
		super();  //it calls base class constructor ---base class of tester is Object class
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
		public String toString()
		{
			return "Tester [eid=" +eid +", name= "+name+", salary= "+sal+"]";
		}
	}
	


