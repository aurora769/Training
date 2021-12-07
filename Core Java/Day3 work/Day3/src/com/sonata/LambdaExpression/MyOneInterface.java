package com.sonata.LambdaExpression;
@FunctionalInterface
public interface MyOneInterface {
	void display();
	default void showOne()
	{
		System.out.println("show this");
	}

}
