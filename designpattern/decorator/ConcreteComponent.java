/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.decorator;

/**
 * Class that represents the actual concrete component providing an
 * implementation of a type of Component.
 * 
 * @author Administrator
 *
 */
public class ConcreteComponent implements Component {

	/**
	 * Constructor
	 */
	public ConcreteComponent(){
		//does nothing
	}
	
	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.decorator.Component#displayMessage()
	 */
	@Override
	public void displayMessage() {
		System.out.println("Displaying Message in Concrete Component");
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.softwarepatterns.designpattern.decorator.Component#getText()
	 */
	@Override
	public String getText(){
		return "Text in Concrete Component";
	}

}
