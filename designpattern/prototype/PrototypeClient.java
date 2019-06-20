/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.prototype;

/**
 * @author Administrator
 *
 */
public class PrototypeClient {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		Prototype prototype = new PrototypeSubject();
		
		for(int i = 0; i < 20; i++){
			PrototypeSubject tempotype = (PrototypeSubject) prototype.clone();
			tempotype.print();
		}
	}

}
