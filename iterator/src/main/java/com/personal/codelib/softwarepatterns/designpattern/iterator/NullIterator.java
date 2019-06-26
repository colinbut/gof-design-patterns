/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.iterator;

/**
 * An iterator that does not iterator.
 * 
 * @author Administrator
 *
 */
public class NullIterator implements Iterator{

	/**
	 * Constructor
	 */
	public NullIterator(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		return null;
	}

}
