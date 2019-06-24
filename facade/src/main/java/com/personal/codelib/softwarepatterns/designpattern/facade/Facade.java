/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.facade;

/**
 * The facade
 * 
 * @author Administrator
 *
 */
public class Facade {
	
	/* private fields */
	private ClassA classA;
	private ClassB classB;
	private ClassC classC;
	
	/**
	 * Constructor
	 */
	public Facade(){
		classA = new ClassA();
		classB = new ClassB();
		classC = new ClassC();
	}
	
	/**
	 * Executes the action
	 */
	public void executeAction(){
		System.out.println("Starting to do something...");
		System.out.println("Name is: " + classB.getName());
		System.out.println("Age is: " + classB.getAge());
		System.out.println(classC.sum());
		classA.printSometext();
		System.out.println("Stopping to do something...");
	}

}
