/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.iterator;

/**
 * Iterator definitions.
 * 
 * @author Administrator
 *
 */
public interface Iterator {

	/**
	 * Checks whether the iterated collection has anymore objects 
	 * 
	 * @return true if has next object otherwise false
	 */
	public boolean hasNext();
	
	/**
	 * Gets the next object in the collection.
	 * 
	 * @return the next object
	 */
	public Object next();
}
