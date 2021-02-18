package com.valuemomentum.training.collection;

 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

 

public class TestArrayList {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> al=new ArrayList<String>();//creating araylist
        al.add("Jim");
        al.add("Jam");
        al.add("Jan");
        al.add("Jet");
        //traversing elements using iterator
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        

 

    }

 

}

