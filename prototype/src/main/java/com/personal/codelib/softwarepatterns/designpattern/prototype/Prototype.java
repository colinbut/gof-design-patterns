/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.prototype;

/**
 * The abstract prototype.
 * 
 * @author Administrator
 *
 */
public abstract class Prototype implements Cloneable{

	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
	
	/**
	 * Abstract method to print some stuff. 
	 * To be implemented.
	 */
	public abstract void print();
	
	
}
