package com.sonata1;

public class Product {
		int pID;
		String pName;
		int pprice;
		Product(){}
		Product(int id,String name,int price)
		{
			this.pID=id;
			this.pName=name;
			this.pprice=price;
		}
		
		public void display()
		{
			System.out.println(pID);
			System.out.println(pName);
			System.out.println(pprice);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Product p1=new Product(123,"Mobile",2345);
			p1.display();
			
		}

	


	}


