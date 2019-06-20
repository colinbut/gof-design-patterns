/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.state;

/**
 * @author Administrator
 *
 */
public class StateContext {

	/* private fields */
	
	private State state;
	
	/**
	 * Constructor
	 */
	public StateContext(){
		setState(new StateA());
	}
	
	/**
	 * Sets the state
	 * 
	 * @param state the new state
	 */
	public void setState(State state){
		this.state = state;
	}
	
	/**
	 * Execute some arbitrary action
	 * 
	 * @param text a piece text
	 */
	public void executeActions(String text){
		System.out.println(text);
		state.stateAction(this);
	}
}
