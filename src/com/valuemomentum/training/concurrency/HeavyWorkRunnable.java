package com.valuemomentum.training.concurrency;

import java.io.*;
public class HeavyWorkRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Doing heavy processing - START "+Thread.currentThread().getName()+"\n");
		try
		{
			Thread.sleep(1000);
			
			//Get database connection, delete unused data from DB
			doDBProcessing();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing - END "+Thread.currentThread().getName()+"\n");
	}

	public void doDBProcessing() throws InterruptedException
	{
		
		Thread.sleep(5000);
	}

}
