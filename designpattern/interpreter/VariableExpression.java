/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.interpreter;

import java.util.Map;

/**
 * @author Administrator
 *
 */
public class VariableExpression implements Expression{

	/* private fields */
	
	private String name;
	
	/**
	 * Constructor
	 * 
	 * @param name
	 */
	public VariableExpression(String name){
		this.name = name;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.interpreter.Expression#interpret(java.util.Map)
	 */
	@Override
	public int interpret(Map<String, Expression> variables) {
		
		if(variables.get(name) == null){
			return 0;
		}
		else{
			return variables.get(name).interpret(variables);
		}
		
	}

}
