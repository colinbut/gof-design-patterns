/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.adapter.objectAdapter;

/**
 * @author Administrator
 *
 */
public class ObjectAdapter implements ObjectAdapteeB{

	/* private fields */
	private ObjectAdapteeA adapteeA = null;
	
	/**
	 * Constructor
	 */
	public ObjectAdapter(){
		adapteeA = new ObjectAdapteeA(); 
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.softwarepatterns.designpattern.adaptor.objectAdapter.ObjectAdapteeB#methodB()
	 */
	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("Adaptee B: Method B");
	}
	
	/**
	 * 
	 */
	public void adapterMethod(){
		methodB();
		
		adapteeA.methodA();
	}

}
