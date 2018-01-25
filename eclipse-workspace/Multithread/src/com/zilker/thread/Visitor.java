package com.zilker.thread;

import java.io.Serializable;

public class Visitor implements Serializable {
	String name;
	int timeneeded;
	
	Visitor(String name,int timeneeded)
	{
		this.name=name;
		this.timeneeded=timeneeded;
	}
}


