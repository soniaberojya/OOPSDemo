class StringBufferDemo {
    /** Constructor. */
    protected StringBufferDemo() 
    {
    }
    public static void main(final String []args)
    {

    StringBuffer buf = new StringBuffer("Java");
    buf.append(" Guide Ver1/"); // append // Java Guide Ver1/7
    String s = buf.toString();   //Convert to string
    System.out.println(s);
    
    buf.append(7);
    s = buf.toString();   //Convert to string
    System.out.println(s);
    
    int index = 5;   // Insert  // Java Student Guide Ver1/7 
    buf.insert(index, "Student ");  
    s = buf.toString();   //Convert to string
    System.out.println(s);
    
    index = 23;      // Set  // Java Student Guide Ver1.7
    buf.setCharAt(index, '.'); 
    s = buf.toString();   //Convert to string
    System.out.println(s);
    
    int start = 24;   // Replace  // Java Student Guide Ver1.8
    int end = 25;
    buf.replace(start, end, "8");                                
    s = buf.toString();   //Convert to string
    System.out.println(s);
    }
}