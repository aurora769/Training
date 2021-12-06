package com.sonataAbstractEmp;

public class UsingPeople {
	public static void main(String[] args)
	{
		Employee emp=new Employee(){
			@Override
			double calSal()
			{
				return 0;
			}
				};
				emp.setBasicPay(2000);
				TechnicalEmp temp=new TechnicalEmp();
				System.out.println(temp);
				Staff sta=new Staff();
				System.out.println(sta);
	}

}
