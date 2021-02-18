package com.valuemomentum.training.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	 

    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Amar Akbar Anthony";
        e.address="Hyderabad";
        e.SSN=111332424;
        e.number=101;
        try {
            FileOutputStream fileout=new FileOutputStream("C:/demo/employee.ser");
            ObjectOutputStream out=new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved in C:/demo/employee.ser");        
        }catch(IOException s) {
            s.printStackTrace();
        }
        

 

    }

 

}