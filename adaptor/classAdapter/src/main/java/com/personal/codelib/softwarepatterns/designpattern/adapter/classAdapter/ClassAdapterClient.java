/*
 * |-------------------------------------------------
 * | Copyright © 2012 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package main.java.com.personal.codelib.softwarepatterns.designpattern.adapter.classAdapter;

/**
 * @author Administrator
 *
 */
public class ClassAdapterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassAdapter classAdapter = new ClassAdapter();
		
		classAdapter.adapterMethod();
	}

}
