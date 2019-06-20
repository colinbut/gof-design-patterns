/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.decorator;

/**
 * Actual decorator which decorates the concrete component.
 * 
 * @author Administrator
 *
 */
public class ConcreteDecorator extends Decorator implements Component{
	
	/* private fields */
	
	private Component decoratingComponent = null;
	
	/**
	 * Constructor
	 * 
	 * @param concreteComponent
	 */
	public ConcreteDecorator(Component concreteComponent){
		decoratingComponent = concreteComponent;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.decorator.Decorator#displayMessage()
	 */
	public void displayMessage(){
		super.displayMessage();
		
		System.out.println("Displaying Message - in Concrete Decorator");
		System.out.println("Additional Message - Have a nice day!");
		System.out.println(decoratingComponent.getText() + " - called by Concrete Decorator");
	}

	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.softwarepatterns.designpattern.decorator.Component#getText()
	 */
	@Override
	public String getText() {
		return "";
	}

}
