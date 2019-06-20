/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.decorator;

/**
 * Representation of a component
 * 
 * @author Administrator
 *
 */
public interface Component {
	
	/**
	 * Displays a message
	 */
	public void displayMessage();
	
	/**
	 * Gets the text string
	 * 
	 * @return the text string
	 */
	public String getText();

}
