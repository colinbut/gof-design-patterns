/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.flyweight;

/**
 * @author Administrator
 *
 */
public class Context {
	
	/* private fields */
	
	private int contextData;
	
	
	/**
	 * Constructor
	 * 
	 * @param data
	 */
	public Context(int data){
		contextData = data;
	}
	
	/**
	 * Returns the context data
	 * @return
	 */
	public int getContextData(){
		return contextData;
	}

}
