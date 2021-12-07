package com.sonata.ExceptionExample;

public class SimpleException {
	public void did()
	{
		try {
			int c=10/0;
			int a[]= {1,2,3,4};
			System.out.println("It is divid method"+c);
			System.out.println("array index"+a[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
		finally
		{
			System.out.println("finaly block");
		}
	}
	public void show()
	{
		System.out.println("This is my show method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleException s1=new SimpleException();
		s1.show();
		s1.did();
		s1.show();
		System.out.println("After all methods");

	}

}
