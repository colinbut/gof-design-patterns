/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.memento;

/**
 * Encapsulates a "State" of a given moment.
 * 
 * @author Administrator
 *
 */
public class State {
	
	/* private fields */
	
	private String state = "";
	
	/**
	 * Constructor
	 */
	public State(){
		//does nothing
	}
	
	/**
	 * Gets the state
	 * 
	 * @return the state
	 */
	public String getState(){
		return state;
	}
	
	/**
	 * Sets the state to be a new state.
	 * 
	 * @param newState the new state to be set
	 */
	public void setState(String newState){
		state = newState;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone(){
		State newState = new State();
		newState.setState(this.getState());
		return newState;
	}

}
