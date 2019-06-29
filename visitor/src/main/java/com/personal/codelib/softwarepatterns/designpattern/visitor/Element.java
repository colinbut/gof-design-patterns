/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.visitor;

/**
 * Abstract representation of an Element
 * 
 * @author Administrator
 *
 */
public abstract class Element {
	
	/**
	 * 
	 * @param visitor
	 */
	public abstract void accept(Visitor visitor);

}
