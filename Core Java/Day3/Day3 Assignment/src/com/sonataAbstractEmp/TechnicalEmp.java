package com.sonataAbstractEmp;

public class TechnicalEmp extends Employee{
	public double calSal()
	{
		double total=Employee.basicPay+Employee.basicPay*.12;
		return total;
	}

	@Override
	public String toString() {
		return "TechnicalEmp [calSal()=" + calSal() + "]";
	}
	

}
