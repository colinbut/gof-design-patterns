/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.interpreter;

import java.util.Map;

/**
 * @author Administrator
 *
 */
public class NumberExpression implements Expression{

	/* private fields */
	private int n;
	
	/**
	 * Constructor
	 * 
	 * @param n 
	 */
	public NumberExpression(int n){
		this.n = n;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.interpreter.Expression#interpret(java.util.Map)
	 */
	@Override
	public int interpret(Map<String, Expression> variables) {
		return n;
	}

}
