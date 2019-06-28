/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.state;

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
