package com.sonata.InterfaceExamples;

public interface BankInterface {
	int abc=30;
	public double withDraw(double amount);
	public double deposite(double amount);
	//can be overriden
	default void newMethod() {
		System.out.println("Newly added default method");
		gen();
	}
	default void myMethod()
	{
		System.out.println("Newly added default method");
		gen();
	}
	private void gen()
	{
		System.out.println("Private Method");
	}
	//can not be overriden
	static void anotherNewMethod() {
		System.out.println("Newly added static method");
		
	}

}
