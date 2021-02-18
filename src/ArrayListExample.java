import java.util.ArrayList;
import java.util.List;

public class ArrayListExample 
{

	public static void main(String[] args) 
	{
		List<Book1> book = new ArrayList<Book1>();
		
		//Creating Books
	    Book1 b1=new Book1(101,"Let us C","Yashwant Kanetkar","BPB",8);
	    Book1 b2=new Book1(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    Book1 b3=new Book1(103,"Operating System","Galvin","Wiley",6);
	    
	    //adding Book to List
	    book.add(b1);
	    book.add(b2);
	    book.add(b3);
	    
	    for(Book1 b:book)
	    {
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	    }
	   
	}

}
