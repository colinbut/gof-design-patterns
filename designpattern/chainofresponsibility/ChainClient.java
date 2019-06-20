/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.chainofresponsibility;

/**
 * @author Administrator
 *
 */
public class ChainClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Handler concreteHandler1 = new ConcreteHandler1();
		Handler concreteHandler2 = new ConcreteHandler2();
		Handler concreteHandler3 = new ConcreteHandler3();
		
		concreteHandler1.setSuccessor(concreteHandler2);
		concreteHandler2.setSuccessor(concreteHandler3);
		
		Request[] requests = new Request[]{
			new Request(1,"Request"),
			new Request(8,"Request"),
			new Request(45,"Request"),
			new Request(2,"Request"),
			new Request(6,"Request"),
			new Request(18,"Request"),
			new Request(10,"Request"),
			new Request(20,"Request"),
			new Request(11,"Request"),
			new Request(99,"Request"),
		};
		
		for(int i = 0; i < requests.length; i++){
			concreteHandler1.handle(requests[i]);
		}
		
	}

}
