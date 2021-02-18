
public class StringBufferDemo2 {

	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("JamesGosling");
		
		//length of string
		int l = str.length();
		System.out.println("Length of String is: "+l);
		
		//capacity of string		
		System.out.println("The Capicity of String is: "+str.capacity());  // capacity = 28 =>length of string+16 => 12+16 = 28
		
		
		//substring
		System.out.println("The Substring: "+str.substring(0,4));
		
		//replacing a portion of string
		System.out.println("after replacing: "+str.replace(5, 10, "Java"));;
		
		//reversing StringBuffer
		StringBuffer revstr = str.reverse();
		System.out.println("Resversed String: "+revstr);
				
				
		

	}

}
