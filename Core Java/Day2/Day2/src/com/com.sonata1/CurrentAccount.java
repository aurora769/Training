package com.sonata1;

public class CurrentAccount extends BankExample {
	CurrentAccount(int a,String b,double c)
	{
		super(a,b,c);
	}
	CurrentAccount()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount c1=new CurrentAccount();
		c1.accNo=123;
		c1.accName="aaaa";
		c1.accBalance=4567;
		c1.display();
		CurrentAccount c2=new CurrentAccount(456,"cyz",234);
		c2.display();

	}

}
