/**
 * 
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.abstractfactory;

/**
 * @author Administrator
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ObjectA_Factory objectAFactory = new ObjectA_Factory();
		new Application(objectAFactory);
		
		ObjectB_Factory objectBFactory = new ObjectB_Factory();
		new Application(objectBFactory);
	}

}
