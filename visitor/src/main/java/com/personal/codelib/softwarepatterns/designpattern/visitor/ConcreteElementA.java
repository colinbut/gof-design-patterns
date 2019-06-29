/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.visitor;

/**
 * @author Administrator
 *
 */
public class ConcreteElementA extends Element{

	/**
	 * Constructor
	 */
	public ConcreteElementA(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.visitor.Element#accept(com.personal.codelib.dp.visitor.Visitor)
	 */
	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
	
	/*
	 * A task
	 */
	public void operationA(){
		System.out.println("ConcreteElementA executing OperationA");
	}

}
