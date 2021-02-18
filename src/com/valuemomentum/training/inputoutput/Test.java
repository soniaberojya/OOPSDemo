package com.valuemomentum.training.inputoutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) throws Throwable 
	{
		DataInputStream d = new DataInputStream(new FileInputStream("C:/demo/test.txt"));
		DataOutputStream out = new DataOutputStream(new FileOutputStream("c:/demo/test1.txt"));
		
		String count;
		while((count = d.readLine())!=null)
		{
			String u = count.toUpperCase();
			System.out.println(u);
			out.writeBytes(u+",");
		}
		d.close();
		out.close();

	}

}
