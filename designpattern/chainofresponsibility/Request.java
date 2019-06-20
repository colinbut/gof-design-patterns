/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.chainofresponsibility;

/**
 * The request
 * 
 * @author Administrator
 *
 */
public class Request {

	/* private fields */
	private int x;
	private String text;
	
	/**
	 * Constructor
	 * 
	 * @param x the x value
	 * @param text a piece of text
	 */
	public Request(int x, String text){
		this.x = x;
		this.text = text;
	}

	/**
	 * Gets the x variable value
	 * 
	 * @return x the value of x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x variable
	 *  
	 * @param x the new x value to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the text
	 * 
	 * @return text the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * Sets the text
	 * 
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	
}
