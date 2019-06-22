/**
 * 
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.abstractfactory;

/**
 * 
 * 
 * @author Administrator
 *
 */
public class ObjectA_Factory implements AbstractFactory{

	/**
	 * Constructor
	 */
	public ObjectA_Factory(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.abstractfactory.AbstractFactory#createObject()
	 */
	@Override
	public IObject createObject() {
		return new ObjectA();
	}

}
