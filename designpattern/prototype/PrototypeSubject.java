/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.prototype;

/**
 * The prototype object that gets created many times.
 * 
 * @author Administrator
 *
 */
public class PrototypeSubject extends Prototype{
	
	/**
	 * Constructor
	 */
	public PrototypeSubject(){
		//does nothing
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.prototype.Prototype#print()
	 */
	public void print() {
		System.out.println("Printing Stuff");
	}

}
