package com.valuemomentum.exceptionhandling;

public class ExceptionsDemo 
{

	public static void main(String[] args) 
	{
		String language[] = {"C","Java", "Python","C#","AWS"};
		try 
		{
			for(int i=1;i<=5;i++)
				System.out.println(language[i]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
