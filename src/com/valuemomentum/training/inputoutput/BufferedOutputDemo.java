package com.valuemomentum.training.inputoutput;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputDemo {

	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fout = new FileOutputStream("c:/demo/f1.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Sachine is my favourate player";
		byte b[] = s.getBytes();
		bout.write(b);
		
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success!!");

	}

}
