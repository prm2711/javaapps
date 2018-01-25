package com.zilker.javex;

public class MainThread extends Thread{

	Thread t;
	@Override
	public void run()
	{
		 for(int i=0; i<10; i++) {
	            System.out.println(i + " looping ...");
	            
	            // Sleep for a while
	            try {
	                Thread.sleep(200);
	            } catch (InterruptedException e) {
	                System.out.println("Interrupted");
	            }
	        }
	}
	public static void main(String[] args)
	{
		
		MainThread t1=new MainThread();
		t1.start();
		Thread.currentThread().interrupt();
		MainThread t2=new MainThread();
		t2.start();
		
		
		
	}
}
