/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.memento;

/**
 * @author Administrator
 *
 */
public class Caretaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Originator originator = new Originator();
		
		State state = new State();
		
		state.setState("State1");
		originator.setState(state);
		
		state.setState("State2");
		originator.setState(state);
		
		originator.saveToMemento();
		
		state.setState("State3");
		originator.setState(state);
		
		state.setState("State4");
		originator.setState(state);
		
		state.setState("State5");
		originator.setState(state);
		
		originator.restore();
		
		
	}

}
