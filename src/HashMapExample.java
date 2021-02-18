import java.util.HashMap;
import java.util.Map;

public class HashMapExample 
{

	public static void main(String[] args) 
	{
		//creating map of Books
		Map<Integer, Book1> mapBook = new HashMap<Integer, Book1>();
		
		//Creating Books 
		Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
		 
		//add books to map
		mapBook.put(1, b1);
		mapBook.put(2, b2);
		mapBook.put(3, b3);
		
		    
		//Traverse map
		System.out.println("BookId\t");
		for(Map.Entry<Integer, Book1> e:mapBook.entrySet())
		{
			int key = e.getKey();
			Book1 b = e.getValue();
			
			System.out.println("Book "+key+" Details------->");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
			System.out.println();
		
		}

	}

}
