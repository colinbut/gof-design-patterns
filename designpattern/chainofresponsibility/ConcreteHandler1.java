/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.chainofresponsibility;

/**
 * @author Administrator
 *
 */
public class ConcreteHandler1 extends Handler {

	/**
	 * Constructor
	 */
	public ConcreteHandler1(){
		//does nothing
	}
	
	
	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.chainofresponsibility.Handler#handle(com.personal.codelib.dp.chainofresponsibility.Request)
	 */
	@Override
	public void handle(Request req) {
		
		if(req.getX() > 0 && req.getX() < 10){
			System.out.println("ConcreteHandler1 handled Request: " + req.getText() + req.getX());
		}
		else if(successor != null){
			successor.handle(req);
		}
	}

}
