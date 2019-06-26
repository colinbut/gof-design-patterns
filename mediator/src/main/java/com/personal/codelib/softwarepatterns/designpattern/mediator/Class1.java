/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.mediator;

/**
 * @author Administrator
 *
 */
public class Class1 implements Command{

	/* private fields */
	
	private Mediator mediator;
	
	/**
	 * Constructor
	 * 
	 * @param med
	 */
	public Class1(Mediator med){
		mediator = med;
		mediator.registerClass1(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.mediator.Command#execute()
	 */
	@Override
	public void execute() {
		
		mediator.doClass1Action();
	}
	
	/**
	 * 
	 */
	public void testAction1(){
		System.out.println("Executing test action1 in Class 1");
	}
	
	/**
	 * 
	 */
	public void testAction2(){
		System.out.println("Executing test action2 in Class 1");
	}
	
	/**
	 * 
	 */
	public void testAction3(){
		System.out.println("Executing test action3 in Class 1");
	}

}
