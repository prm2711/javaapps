package com.zilker.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Multithreading {
	private static Scanner scan = new Scanner(System.in);
	private static Logger log = Logger.getLogger(Multithreading.class.getName());
	public static int counter = 0;

	public static void main(String args[]) {
		ArrayList<Visitor> visitorlist = new ArrayList<Visitor>();
		boolean readNext = true;
		String visitorname = null;
		int time = 0;
		int numberofcustomers = 0, count;
		log.info("Enter number of counters: ");
		counter = scan.nextInt();
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("C:\\Users\\Priyamvada Mukund\\eclipse-workspace\\Multithread\\src\\com\\zilker\\thread\\visitors");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			log.warning("No file");
		}
		// log.info("Enter number of customers: ");
		// numberofcustomers = scan.nextInt();
		/*
		 * for (count = 0; count < numberofcustomers; count++) {
		 * log.info("Enter name and time needed for visitor: "); visitorname =
		 * scan.next(); time = scan.nextInt(); Visitor visitor = new
		 * Visitor(visitorname, time); visitorlist.add(visitor);
		 * 
		 * }
		 */
		ObjectInputStream input = null;
		try {
			input = new ObjectInputStream(fis);
			/*
			 * while (readNext) { Visitor visitor = (Visitor) input.readObject(); if
			 * (visitor != null) visitorlist.add(visitor); else readNext = false; }
			 */
		} catch (IOException e) {
			log.warning("IO");
		} /*
			 * catch (ClassNotFoundException e) { 
			 * log.warning("No class"); }
			 */
		// Visitor visitor = new Visitor(visitorname, time);
		finally {

			try {
				if (input != null)
					input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				log.warning("Io close");
			}

		}
		ExecutorService executor = Executors.newFixedThreadPool(counter);

		for (int i = 0; i < visitorlist.size(); i++) {
			Runnable queue = new VisitorThread(visitorlist.get(i).name, visitorlist.get(i).timeneeded);
			executor.execute(queue);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
		}

	}
}
