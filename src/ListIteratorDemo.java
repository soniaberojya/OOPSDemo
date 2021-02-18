import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("Jim");
		al.add("Jerry");
		al.add("John");
		al.add(1,"Jive");
		System.out.println("elements at 2nd position :"+al.get(2));
		
		ListIterator<String> itr = al.listIterator();
		System.out.println("Traversing elements in forward direction....");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("Traversing elements in reverse direction....");
		{
			while(itr.hasPrevious())
			{
				System.out.println(itr.previous());
				
			}
		}
		

	}

}
