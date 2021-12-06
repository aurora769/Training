package com.sonata.Emp;

public class Developer extends Emp{
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public Developer(int i, String j, double k) {
		super(i,j,k);
	}
	//Overridden Method
	public double calSal(double HRA,double DA) {
		double total = super.calSal(HRA, DA) + 5000;
		return total;
	}
	public static void main(String[] args) {
		Developer m1 = new Developer(19, "Rahul", 160000);
		m1.display();
		System.out.println("Salary with Bonus: " + m1.calSal(200, 500));
	}

}
