
public class Complex {
	double real;
	double imaginary;
	
	public Complex(double r, double i)
	{
		real = r;
		imaginary = i;
	}
	void add(Complex obj2, Complex obj3)
	{
		this.real = this.real+obj2.real+obj3.real;
		this.imaginary = this.imaginary+ obj2.imaginary+obj3.imaginary;
	}
	void display()
	{
		System.out.println(this.real+" +i"+this.imaginary);
	}

	public static void main(String[] args) 
	{
		Complex obj1 = new Complex(10.3, 67.4);
		Complex obj2 = new Complex(0.7, 3.6);
		Complex obj3 = new Complex(1.0, 1.0);
		
		
		obj1.add(obj2,obj3);     //object is passed as argument
		System.out.println("Addition of Complex numbers is");
		
		obj1.display();
		
	}

}
