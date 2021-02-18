package com.valuemomentum.training.inputoutput;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * A BufferedReader example that reads a file line by line
 */

public class BufferedReaderExample {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("c:/demo/countries.txt")));
			String line = ""; //can also write String line = br.readLine();	while(line!=null)
		
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace(); 
		} catch (IOException e) {
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();		}	}}