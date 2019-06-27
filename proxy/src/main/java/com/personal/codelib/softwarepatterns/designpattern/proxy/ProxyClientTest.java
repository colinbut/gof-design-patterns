/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.proxy;

/**
 * @author Administrator
 *
 */
public class ProxyClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		
		proxy.doAction();
		proxy.doAction();
	}

}
