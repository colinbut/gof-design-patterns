/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.facade;

/**
 * Class C
 * 
 * @author Administrator
 *
 */
public class ClassC {
	
	/* private fields */
	
	private int x = 0;
	private int y = 2;
	
	/**
	 * Constructor
	 */
	public ClassC(){
		//does nothing
	}
	
	/**
	 * Gets the sum of 2 values in (x + y)
	 * 
	 * @return the sum of x + y
	 */
	public int sum(){
		return x + y;
	}

}
