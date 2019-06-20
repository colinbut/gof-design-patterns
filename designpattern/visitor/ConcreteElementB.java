/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.visitor;

/**
 * @author Administrator
 *
 */
public class ConcreteElementB extends Element{

	/**
	 * Constructor
	 */
	public ConcreteElementB(){
		//does nothing
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.visitor.Element#accept(com.personal.codelib.dp.visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}
	
	/*
	 * A task
	 */
	public void operationB(){
		System.out.println("ConcreteElementB executing OperationB");
	}

}
