
class Sample<T>  //Generic Class
{
	private T data;
	

	public Sample(T data) 
	{
		super();
		this.data = data;
	}

	public T getData() 
	{
		return data;
	}

	public void setData(T data) 
	{
		this.data = data;
	}
	
}

public class GenericClassDemo 
{

	public static void main(String[] args) 
	{
		Sample<Integer> s1 = new Sample<Integer>(15); //Creating an object of type Sample class
		//s1.setData(15);
		System.out.println("Display from generic class of type Integer: "+s1.getData()); //displaying data from generic type
	

		Sample<String> s2 = new Sample<String>("Java Generics"); //Creating an object of type Sample class
		//s2.setData("Java Generics");
		System.out.println("Display from generic class of type String: "+s2.getData()); //displaying data from generic type
		
		Sample<Float> s3 = new Sample<Float>(22.3F); //Creating an object of type Sample class
		//s3.setData(22.3F);
		System.out.println("Display from generic class of type Float: "+s3.getData()); //displaying data from generic type

	
	}

}
