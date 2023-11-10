package com.demo.test;

public class demo {

	protected void finalize() throws Throwable
	{
		try {
			System.out.println("inside demo's finalize()");
		    } 
		catch(Throwable e) {
			throw e;
		}
		
			finally {
			System.out.println("Calling finalize method"
							+ " of the Object class");
			super.finalize();
			}
	}
	public static void main(String[] args) throws Throwable
	{
		demo d = new demo();
		demo d2 = new demo();
		d2 = null;
		System.gc();
		d.finalize();
	}
}