package com.valuemomentum.exceptionhandling;

// Java program to demonstrate user defined exception
//this program throws an exception whenever balance amount is less than Rs 1000

public class MyException extends Exception
{
	
	//Store account info
	private static int accno[] = {1001,1002,1003,1004,1005};
	
	private static String name[] = {"Nish","Shubh","Sush","Abhi","Akash"};
	
	private static double bal[] = {10000.00,12000.00,999.00,1100.55};
	
	MyException()
	{
		
	}
	
	MyException(String str)
	{
		super(str);
	}
	
	public static void main(String[] args)
	{
		try
		{
			System.out.println("ACCNO"+"\t"+"CUSTOMER"+"\t"+"BALANCE");
			
			//display actual account information
			for(int i=0; i<5; i++)
			{
				System.out.println(accno[i]+"\t"+name[i]+"\t\t"+bal[i]);
				
				//display own exception if balance<1000
				if(bal[i]<1000)
				{
					MyException me = new MyException("Balance is Less than 1000");
					throw me;

				}
			}
		} // end of try
		
		catch (MyException e)
		{
			e.printStackTrace();
		}

	}

}
