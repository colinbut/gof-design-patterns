/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.interpreter;

import java.util.Map;

/**
 * @author Administrator
 *
 */
public class MinusExpression implements Expression{

	/* private fields */
	
	private Expression leftOperand;
	private Expression rightOperand;
	
	/**
	 * Constructor
	 * 
	 * @param left
	 * @param right
	 */
	public MinusExpression(Expression left, Expression right){
		leftOperand = left;
		rightOperand = right;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.interpreter.Expression#interpret(java.util.Map)
	 */
	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) - rightOperand.interpret(variables);
	}

}
