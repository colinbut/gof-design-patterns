/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.proxy;

/**
 * The proxy object. A proxy for the real subject.
 * 
 * @author Administrator
 *
 */
public class Proxy implements ISubject{

	/* private fields */
	
	private RealSubject realThing = null;
	
	/**
	 * Constructor
	 */
	public Proxy(){
		//does nothing
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.proxy.ISubject#doAction()
	 */
	@Override
	public void doAction() {
		//if the actual subject is null..make it
		if(realThing == null){
			realThing = new RealSubject();
		}
		realThing.doAction();
	}

}
