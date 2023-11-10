package com.test;

public class Lambda{
	 
    public static void main(String[] args)
    {
 
        Runnable myThread = () ->
        {
 
            Thread.currentThread().setName("Thread");
            System.out.println(
                Thread.currentThread().getName()
                + " is running");
        };
 
        Thread run = new Thread(myThread);
        run.start();
        try {
			run.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
        run.stop();
        System.out.println("End------------");
        }
}