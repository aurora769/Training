package com.sonata.InterfaceExamples;

public class SimpleAccount extends Bank implements BankInterface {
	@Override
	public double withDraw(double amount)
	{
		double x=super.Balance-amount;
		return x;
	}
	@Override
	public double deposite(double amount)
	{
		double y=super.Balance+amount;
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleAccount s1=new SimpleAccount();
		s1.AccID=123;
		s1.AccName="abc";
		s1.Balance=1000;
		s1.display();
		System.out.println(s1.deposite(1000));
		s1.newMethod();
		System.out.println(s1);

	}

}
