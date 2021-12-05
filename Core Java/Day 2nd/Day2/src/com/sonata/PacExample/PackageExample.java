package com.sonata.PacExample;

public class PackageExample {
	private int add(int a,int b)
	{
		return a+b;
	}
	int sub(int a,int b)
	{
		return b-a;
		
	}
	protected int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PackageExample a1=new PackageExample();
		System.out.println(a1.add(10,20));
		a1.sub(10,20);
		a1.mul(10,20);
		a1.div(20,10);

	}

}
