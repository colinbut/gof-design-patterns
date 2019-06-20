/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.composite;

/**
 * @author Administrator
 *
 */
public class Leaf implements Component {

	/**
	 * Constructor
	 */
	public Leaf(){
		//does nothing
	}
	
	/* 
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.composite.Component#operation()
	 */
	@Override
	public void operation() {
		
		System.out.println("This is a Leaf");
		
	}

}
