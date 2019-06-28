/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.state;

/**
 * @author Administrator
 *
 */
public class StateB implements State{

	/* private fields */
	
	private int count = 0;
	
	/**
	 * Constructor
	 */
	public StateB(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.state.State#stateAction(com.personal.codelib.dp.state.StateContext)
	 */
	@Override
	public void stateAction(StateContext stateContext) {
		
		System.out.println("In State B");
		//switch state when in State B more than 2 times
		if(++count > 1){
			stateContext.setState(new StateA());
			System.out.println("Switching to State A");
		}
	}

}
