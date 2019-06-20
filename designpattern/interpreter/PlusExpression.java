/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.interpreter;

import java.util.Map;

/**
 * @author Administrator
 *
 */
public class PlusExpression implements Expression{

	/* private fields */
	
	private Expression leftOperand;
	private Expression rightOperand;
	
	/**
	 * Constructor
	 * @param left
	 * @param right
	 */
	public PlusExpression(Expression left, Expression right){
		leftOperand = left;
		rightOperand = right;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.interpreter.Expression#interpret(java.util.Map)
	 */
	@Override
	public int interpret(Map<String, Expression> variables) {
		return leftOperand.interpret(variables) + rightOperand.interpret(variables);
	}

}
