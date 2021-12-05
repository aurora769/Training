package com.sonata1;

public class BankExample {
	int accNo;
	String accName;
	double accBalance;
	BankExample(int n, String name, double b){
		this.accNo = n;
		this.accName= name;
		this.accBalance=b;
		}
		BankExample()
		{}
		
	public void deposit()
	{
		System.out.println("This is deposite");
	}
	public void withDraw()
	{
		System.out.println("This is withdraw");
	}
	public void display()
	{
		System.out.println(accNo);
		System.out.println(accName);
		System.out.println(accBalance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankExample b1=new BankExample();
		b1.accNo=123;
		b1.accName="xyz";
		b1.accBalance=1234;
		b1.display();
		
		BankExample b2 = new BankExample(123,"abc",3456);//constructor

		b2.display();

	}

}
