package com.valuemomentum.exceptionhandling;

public class ThrowDemo 
{
	public static void hello(int a)
	{
		if(a==0)
		{
			throw new ArithmeticException("Testing Exception");
		}
	}
	
	public static void main(String [] args)
	{
		hello(0);			
	
	}
}
