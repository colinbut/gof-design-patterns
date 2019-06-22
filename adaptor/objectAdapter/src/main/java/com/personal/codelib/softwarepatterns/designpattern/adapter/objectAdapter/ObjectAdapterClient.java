/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.adapter.objectAdapter;

/**
 * @author Administrator
 *
 */
public class ObjectAdapterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ObjectAdapter objectAdapter = new ObjectAdapter();
		
		objectAdapter.adapterMethod();
	}

}
