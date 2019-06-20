/**
 * 
 */
package com.personal.codelib.softwarepatterns.designpattern.template;

/**
 * @author Administrator
 *
 */
public class TemplateClient extends TemplateMethod{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TemplateClient tc = new TemplateClient();
		tc.template();
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.template.TemplateMethod#hook1()
	 */
	@Override
	public void hook1() {
		System.out.println("Hooking into Hook1");
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.template.TemplateMethod#hook2()
	 */
	@Override
	public void hook2() {
		System.out.println("Hooking into Hook2");
	}

	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.template.TemplateMethod#hook3()
	 */
	@Override
	public void hook3() {
		System.out.println("Hooking into Hook3");
	}

	/*
	 * (non-Javadoc)
	 * @see com.personal.codelib.dp.template.TemplateMethod#overrideThis()
	 */
	@Override
	public void overrideThis() {
		System.out.println("Implementing this Overriding method");
		
		System.out.println("Performing some calculations...");
		
		int ans = 0;
		
		ans = 7 + 3;
		
		System.out.println("7 + 3 is " + ans);
		
		System.out.println("Finished performing some calculations!");
	}

}
