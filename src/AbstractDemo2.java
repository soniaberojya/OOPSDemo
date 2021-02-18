abstract class Shape1
{
	String objectName = " ";
	Shape1(String name)
	{
		this.objectName = name;
	}
	public void moveTo(int x, int y)
	{
		System.out.println(this.objectName+" "+"has been moved to "+"x = "+x+"y =  "+y);
		
		//abstract methods which will be implemented by its subclass\classes
		
	}
	abstract public double area();
	abstract public void draw();
	
	
}
class Rectangle extends Shape1
{
	int length, width;
	//constructor
	Rectangle(int length, int width, String name)
	{
		super(name);
		this.length = length;
		this.width = width;
	}
	public void draw()
	{
		System.out.println("Rectangle has been drawn");
	}
	public double area()
	{
		return(double)(length * width);
	}
}
class Circle extends Shape1
{
	double pi = 3.14;
	int radius;
	Circle(int radius, String name)
	{
		super(name);
		this.radius = radius;
	}
	public void draw()
	{
		System.out.println("Circle has been drawn");
	}
	public double area()
	{
		return(double)((pi*radius*radius)/2);
	}
}


public class AbstractDemo2 
{

	public static void main(String[] args) 
	{
		// creating the object of rectangle class and using shape class reference
		
		Shape1 rect = new Rectangle(2,2,"Rectangle");
		System.out.println("Area of Rectangle :"+rect.area());
		rect.moveTo(1,2);
		System.out.println(" ");
		//Creating the Ojects of Circle Class
		Shape1 circle = new Circle(2,"Circle");
		System.out.println("Area of Circle : "+circle.area());
		rect.moveTo(2,4);
		System.out.println(" ");

		
	}

}
