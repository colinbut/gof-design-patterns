/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.interpreter;

import java.util.*;

/**
 * @author Administrator
 *
 */
public interface Expression {
	
	/**
	 * Interpret an expression with a given map of symbols
	 * 
	 * @param variables
	 */
	public int interpret(Map<String, Expression> variables);

}
