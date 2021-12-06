package com.sonata.Exception;

public class CallException {
	
		public static void main(String[] args) throws MyException {
			double empSal = 10000;
			if(empSal<100000) {
				throw new MyException("Salary does not the minimum criteia.");
			}
			else {
				System.out.println("Welcome to our program.");

}
		}
}
