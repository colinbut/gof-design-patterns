/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.memento;

/**
 * @author Administrator
 *
 */
public class Originator {
	
	/* private fields */
	
	private State state;
	private Memento memento;
	
	/**
	 * Constructor
	 */
	public Originator(){
		//does nothing
	}
	
	/**
	 * Changes the state 
	 * 
	 * @param newState the new state
	 */
	public void setState(State newState){
		System.out.println("Setting State to: " + newState.getState());
		state = newState;
	}
	
	/**
	 * Save state to a "Memento" object
	 */
	public void saveToMemento(){
		System.out.println("Saving state: " + state.getState());
		memento = new Memento(state);
	}
	
	/**
	 * Restore to previous saved state
	 */
	public void restore(){
		state = memento.getSavedState();
		System.out.println("Restoring state to : " + state.getState());
	}

}
