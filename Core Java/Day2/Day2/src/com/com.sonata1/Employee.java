package com.sonata1;

public class Employee {
	int empId;
	String empName;
	double empSal;
	Employee(){}
	Employee(int id,String name,double sal)
	{
		this.empId=id;
		this.empName=name;
		this.empSal=sal;
	}
	public double salCal(double HRA,double DA)
	{
		double total=this.empSal+HRA+DA;
		return total;
	}
	public void display()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(123,"Namrata",2345);
		e1.display();
		Employee e2=new Employee();
		e2.display();

	}

}
