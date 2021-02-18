package com.valuemomentum.training.inputoutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo 
{

	public static void main(String[] args) 
	{
		Employee e = null;
		try
		{
			FileInputStream fileIn = new FileInputStream("c:/demo/employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee)in.readObject();
			in.close();
			fileIn.close();
			
		}
		catch(IOException i)
		{
			i.printStackTrace();
		} catch (ClassNotFoundException e1) 
		{
			System.out.println("Class Not Found");
			e1.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee......");
		System.out.println("Name: "+e.name);
		System.out.println("Address: "+e.address);
		System.out.println("SSN: "+e.SSN); //it will show 0 since SSN is transient
		System.out.println("Number: "+e.number);
		

	}

}
