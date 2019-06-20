/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.state;

/**
 * Interface to present a "State"
 * 
 * @author Administrator
 *
 */
public interface State {

	/**
	 * 
	 * @param stateContext
	 */
	public void stateAction(StateContext stateContext);
}
