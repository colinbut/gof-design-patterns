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
public class ConcreteVisitor2 extends Visitor{

	/**
	 * Constructor
	 */
	public ConcreteVisitor2(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.visitor.Visitor#visitConcreteElementA(com.personal.codelib.dp.visitor.ConcreteElementA)
	 */
	@Override
	public void visitConcreteElementA(ConcreteElementA A) {
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.visitor.Visitor#visitConcreteElementB(com.personal.codelib.dp.visitor.ConcreteElementB)
	 */
	@Override
	public void visitConcreteElementB(ConcreteElementB B) {
		//does nothing
	}

}
