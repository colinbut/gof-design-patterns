/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.proxy;

/**
 * Implementation of a Subject
 * 
 * @author Administrator
 *
 */
public class RealSubject implements ISubject{

	/**
	 * Constructor
	 */
	public RealSubject(){
		initialising();
	}
	
	/*
	 * Initializing work
	 */
	private void initialising(){
		System.out.println("Initialising this Real Subject");
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.softwarepatterns.designpattern.proxy.ISubject#doAction()
	 */
	@Override
	public void doAction() {
		System.out.println("Doing Action in Real Subject");
	}

}
