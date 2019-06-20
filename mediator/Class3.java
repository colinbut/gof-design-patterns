/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.mediator;

/**
 * @author Administrator
 *
 */
public class Class3 implements Command{

	/* private fields */
	
	private Mediator mediator;
	
	/**
	 * Contructor
	 * 
	 * @param med
	 */
	public Class3(Mediator med){
		mediator = med;
		mediator.registerClass3(this);
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.mediator.Command#execute()
	 */
	@Override
	public void execute() {
		
		mediator.doClass3Action();
	}
	
	/**
	 * 
	 */
	public void testAction1(){
		System.out.println("Executing test action1 in Class 3");
	}
	
	/**
	 * 
	 */
	public void testAction2(){
		System.out.println("Executing test action2 in Class 3");
	}
	
	/**
	 * 
	 */
	public void testAction3(){
		System.out.println("Executing test action3 in Class 3");
	}

}
