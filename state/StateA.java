/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.state;

/**
 * @author Administrator
 *
 */
public class StateA implements State{

	/**
	 * Constructor
	 */
	public StateA(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.state.State#stateAction(com.personal.codelib.dp.state.StateContext)
	 */
	@Override
	public void stateAction(StateContext stateContext) {
		System.out.println("In State A : now switching to State B");
	    stateContext.setState(new StateB());
	}

}
