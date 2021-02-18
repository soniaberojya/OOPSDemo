import com.valuemomentum.training.collection.*;

import java.util.*;

public class TestArrayList
{
	public static void main(String [] args)
	{
		List<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("michael");
		al.add("james");
		al.add("andy");
		
		System.out.println(al);

		Iterator<String> itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		al.remove(0);
		
		System.out.println("*******Display using for Each Loop");
		for(String i:al)
		{
			System.out.println(i);
		}
				
		System.out.println(al.get(1));
        al.add(3, "Raj");
        al.remove(0);
        al.set(1, "Java");		
			
	}
}

