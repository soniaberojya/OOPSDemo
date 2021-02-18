import java.util.Iterator;
import java.util.Stack;

public class StackDemo 
{

	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<String>();
		
		s.push("Java");
		s.push("C++");
		s.push("C#");
		s.push("Python");
		
		System.out.println(s);
		
		
		//s.push("Ruby");
		//System.out.println(s);
		
		Iterator<String> itr=s.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println("peek = "+s.peek()); // s.peek() to see last element
        System.out.println(s);
        System.out.println("Pop = "+s.pop()); //s.pop() to remove last element
        System.out.println(s);
        System.out.println("Pop = "+s.remove(0)); //s.remove(index) to remove element of given index
        System.out.println(s);
        //s.get(0) to get element of specified index
        

	}

}
