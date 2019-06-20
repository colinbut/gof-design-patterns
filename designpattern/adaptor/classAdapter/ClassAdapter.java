/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.adaptor.classAdapter;

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
