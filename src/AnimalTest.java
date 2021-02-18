//example of single inheritance

class Animal
{
	String name;
	public void eat()
	{
		System.out.println("I can eat");
	}
}
class Dog extends Animal
{
	// new method in subclass
	
		public void display()
		{
			System.out.println("My name is "+ name);
		}
	
}


public class AnimalTest  //inherit from Animal
{

	public static void main(String[] args) 
	{
		//create an object of a subclass
		Dog labrador = new Dog();
		
		//access field of superclass
		labrador.name = "Pillu";
		labrador.display();
		labrador.eat();
		

	}

}
