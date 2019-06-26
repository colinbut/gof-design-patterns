/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.observer;

/**
 * 
 * 
 * @author Administrator
 *
 */
public class Subject extends AObservable{
	
	/**
	 * Constructor
	 */
	public Subject(){
		//does nothing
	}
	
	/**
	 * Perform some action
	 */
	public void action(){
		//do something then update observers
		
		this.setChanged();
		this.notifyObservers();
	}

}
