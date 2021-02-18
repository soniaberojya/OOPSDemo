package com.valuemomentum.exceptionhandling;

public class ExceptionMultipleCatch 
{

	public static void main(String[] args) 
	{
		int num1 = 10;
		int num2=0;
		int result = 0;
		int arr[] = new int[5];
		try
		{
			arr[0] = 0;
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 3;
			arr[4] = 4;
			//arr[5] = 5; //--Array index out of bounds...since 6th element
			result = num1/num2;  //error- Arithmetic exception (division by zero)
			System.out.println("Result of division: "+result);
					
		}
		
		/*catch(ArithmeticException e)
		{
			System.out.println("Err: Division by zero");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Err: Array out of Bound");
		}*/
		
		catch(Exception e)   //general exception
		{
			e.printStackTrace();
		}

	}

}
