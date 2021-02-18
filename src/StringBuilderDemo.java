public class StringBuilderDemo { 
    public static void main(String[] argv) 
        throws Exception 
    { 
  
        // create a StringBuilder object 
        // with a String pass as parameter 
        StringBuilder str = new StringBuilder("HELLOWORLD");
        // print string 
        System.out.println("String = " + str.toString()); 
                          
  
  
        // Append ', '(44) to the String--->44 is ASCII code for ","
        str.appendCodePoint(44); //append string based on ASCII value
        // Print the modified String 
        System.out.println("Modified StringBuilder = " + str); 
                          
  
        // get capacity 
        int capacity = str.capacity(); 
        // print the result 
        System.out.println("StringBuilder = " + str); 
        System.out.println("Capacity of StringBuilder = " + capacity);
                          
        

        // reverse the string 
        StringBuilder reverseStr = str.reverse(); 
        // print string 
        System.out.println("Reverse String = "+reverseStr);
                           
    } 
} 