package com.valuemomentum.training.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample2
{
	public static void main(String args[])throws Exception
	{             
	    InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);            
	    System.out.println("Enter your name and age");    
	    String name=br.readLine();  
	    int age = Integer.parseInt(br.readLine());
	    
	    System.out.println("Welcome "+name+"\nage: "+age);
    
   }    
}  