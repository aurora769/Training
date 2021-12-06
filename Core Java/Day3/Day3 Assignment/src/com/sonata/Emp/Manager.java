package com.sonata.Emp;


	public class Manager extends Emp{
		public Manager() {
			// TODO Auto-generated constructor stub
		}
		public Manager(int i, String j, double k) {
			super(i,j,k);
		}
		//Overridden Method
		public double calSal(double HRA,double DA) {
			double total = super.calSal(HRA, DA) + 10000;
			return total;
		}
		public static void main(String[] args) {
			Manager n1 = new Manager(102, "Manager", 40000);
			n1.display();
			System.out.println("Salary with Bonus:" + n1.calSal(200, 500));
		}
	

}
