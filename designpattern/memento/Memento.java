/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.memento;

/**
 * @author Administrator
 *
 */
public class Memento {

	/* private fields */
	
	private final State state;
	
	/**
	 * Constructor
	 * 
	 * @param state
	 */
	public Memento(State state){
		this.state = (State) state.clone();
	}
	
	/**
	 * Return the saved state
	 * 
	 * @return state the state to return
	 */
	public State getSavedState(){
		return state;
	}
}
