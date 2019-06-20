/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.mediator;

/**
 * @author Administrator
 *
 */
public class Class2 implements Command{

	/* private fields */
	
	private Mediator mediator;
	
	/**
	 * Constructor
	 * 
	 * @param med
	 */
	public Class2(Mediator med){
		mediator = med;
		mediator.registerClass2(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.mediator.Command#execute()
	 */
	@Override
	public void execute() {
		
		mediator.doClass2Action();
	}
	
	/**
	 * 
	 */
	public void testAction1(){
		System.out.println("Executing test action1 in Class 2");
	}
	
	/**
	 * 
	 */
	public void testAction2(){
		System.out.println("Executing test action2 in Class 2");
	}
	
	/**
	 * 
	 */
	public void testAction3(){
		System.out.println("Executing test action3 in Class 2");
	}

}
