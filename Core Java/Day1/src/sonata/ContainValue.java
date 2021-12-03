package com.sonata;

public class ContainValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {10, 20, 30, 40};
	      int num = 30;

	      for(int i = 0; i<myArray.length; i++){
	         if(num == myArray[i]){
	            System.out.println("Array contains the given element");
	         }
	      }

	}

}
