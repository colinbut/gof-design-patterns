/**
 * 
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.abstractfactory;

/**
 * @author Administrator
 *
 */
public class ObjectB_Factory implements AbstractFactory{

	/**
	 * Constructor
	 */
	public ObjectB_Factory(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see main.java.com.personal.codelib.softwarepatterns.designpattern.abstractfactory.AbstractFactory#createObject()
	 */
	@Override
	public IObject createObject() {
		return new ObjectB();
	}

}
