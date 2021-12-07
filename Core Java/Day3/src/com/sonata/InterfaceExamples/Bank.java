package com.sonata.InterfaceExamples;

public class Bank {
	
		int AccID;
		String AccName;
		double Balance;
		public Bank(){}
		public Bank(int accId,String accName,double balance)
		{
			AccID=accId;
			AccName=accName;
			Balance=balance;
		}
		void display()
		{
			System.out.println(this.AccID);
			System.out.println(this.AccName);
			System.out.println(this.Balance);
		
		

		}

	}


	


