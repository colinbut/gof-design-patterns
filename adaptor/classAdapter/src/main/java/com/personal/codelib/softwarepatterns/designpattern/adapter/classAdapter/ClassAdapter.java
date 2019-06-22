/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.adapter.classAdapter;

/**
 * @author Administrator
 *
 */
public class ClassAdapter extends ClassAdapteeA implements ClassAdapteeB{
	
	/**
	 * Constructor
	 */
	public ClassAdapter(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.adaptor.classAdapter.AdapteeB#methodB()
	 */
	@Override
	public void methodB() {
		System.out.println("Adaptee B: Method B");
	}
	
	/**
	 * 
	 */
	public void adapterMethod(){
		methodB();
		
		methodA();
	}

}
