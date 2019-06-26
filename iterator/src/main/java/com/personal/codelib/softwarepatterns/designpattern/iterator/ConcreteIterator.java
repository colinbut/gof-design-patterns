/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.iterator;

/**
 * A concrete iterator which iterates over a collection of objects.
 * 
 * @author Administrator
 *
 */
public class ConcreteIterator implements Iterator{

	/* private fields */
	private Object[] items = null;
	private int position = 0;
	
	
	/**
	 * Constructor
	 * 
	 * @param items
	 */
	public ConcreteIterator(Object[] items){
		this.items = items;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.iterator.Iterator#hasNext()
	 */
	@Override
	public boolean hasNext() {
		
		if((position >= items.length) || (items[position] == null)){
			return false;
		}
		else{
			return true;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.iterator.Iterator#next()
	 */
	@Override
	public Object next() {
		
		Object item = items[position];
		position += 1;
		return item;
	}

}
