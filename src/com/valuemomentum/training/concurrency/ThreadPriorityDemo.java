package com.valuemomentum.training.concurrency;

class ThreadPriorityDemo extends Thread{

	 public void run(){

	     System.out.println("Running thread is "+Thread.currentThread().getName());
	     System.out.println("Running thread priority is "+Thread.currentThread().getPriority());
	  }

	public static void main(String args[]){

	   ThreadPriorityDemo t1 = new ThreadPriorityDemo();
	   ThreadPriorityDemo t2 = new ThreadPriorityDemo();
	   ThreadPriorityDemo t3 = new ThreadPriorityDemo();

	   t1.setPriority(Thread.MAX_PRIORITY);
	   t2.setPriority(Thread.NORM_PRIORITY);
	   t3.setPriority(Thread.MIN_PRIORITY); 

	   
	   t1.setName("maximum priority");
	   t2.setName("normal priority");
	   t3.setName("minimum priority");
	   
	   
	   t1.start();
	   t2.start();
	   t3.start();
	   
	 }
	}