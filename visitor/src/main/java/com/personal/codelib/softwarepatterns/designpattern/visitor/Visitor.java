/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.visitor;

/**
 * Abstract representation of a visitor.
 * 
 * @author Administrator
 *
 */
public abstract class Visitor {

	/**
	 * Visits the concrete element A
	 * 
	 * @param A the concrete element to visit
	 */
	public abstract void visitConcreteElementA(ConcreteElementA A);
	
	/**
	 * Visits the concrete element B
	 * 
	 * @param B the concrete element to visit
	 */
	public abstract void visitConcreteElementB(ConcreteElementB B);
	
}
