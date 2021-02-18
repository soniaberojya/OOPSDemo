package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class FileClass {

	public static void main(String[] args) 
	{
		File f = new File("hello.txt");
		try
		{
			
			if(f.createNewFile())
			{
				System.out.println("New FIle Created!!!");
			}
			else 
			{
				System.out.println("The File already exists.");				
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Name of File: "+f.getName());
		System.out.println("Path of file: "+f.getPath());
		System.out.println("File Last Modified: "+new Date(f.lastModified()));
		System.out.println("Parent Directory: "+f.getParent());
		System.out.println("Size of file: "+f.length()+"Bytes");

	}

}
