/**
 * 
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.chainofresponsibility;

/**
 * @author Administrator
 *
 */
public class ConcreteHandler2 extends Handler {

	/**
	 * Constructor
	 */
	public ConcreteHandler2(){
		//does nothing
	}
	
	
	/* (non-Javadoc)
	 * @see com.personal.codelib.dp.chainofresponsibility.Handler#handle(com.personal.codelib.dp.chainofresponsibility.Request)
	 */
	@Override
	public void handle(Request req) {
		
		if(req.getX() >= 10 && req.getX() <= 20){
			System.out.println("ConcreteHandler2 handled Request: " + req.getText() + req.getX());
		}
		else if(successor != null){
			successor.handle(req);
		}
	}

}
