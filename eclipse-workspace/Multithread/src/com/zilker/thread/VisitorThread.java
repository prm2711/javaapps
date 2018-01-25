package com.zilker.thread;

import java.util.logging.Logger;

public class VisitorThread implements Runnable {
	private static Logger log = Logger.getLogger(VisitorThread.class.getName());

	private String name;
	private int timeneeded;

	public VisitorThread(String name, int timeTaken) {
		this.name = name;
		this.timeneeded = timeTaken;
	}

	@Override
	public void run() {
		int count=Multithreading.counter;
		int i;
		for(i=1;i<=count;i++) {
		if (Thread.currentThread().getName().equals("pool-1-thread-"+i))
		Thread.currentThread().setName("Counter "+i);
		}
		System.out.println(Thread.currentThread().getName() + "  Entered.  " + name);
		processInput();
		System.out.println(Thread.currentThread().getName() + " Finished.");
	}

	private void processInput() {
		try {
			Thread.sleep(timeneeded);
		} catch (InterruptedException e) {
			log.warning("Interrupted thread");
		}
	}

	
			
		
	@Override
	public String toString() {
		return this.name;
	}

}
