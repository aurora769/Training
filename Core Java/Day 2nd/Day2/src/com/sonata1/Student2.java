package com.sonata1;

	public class Student2 extends StudentExample {
		Student2(int m,int n,String o)
		{
			super(m,n,o);
		}
	
		Student2()
		{
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 c1=new Student2();
		c1.stdId=123;
		c1.stdMarks=76;
		c1.stdName="Namrata";
		c1.display();
		Student2 c2 = new Student2(123,76,"Namrata");//constructor

		c2.display();
		
		

	}

}
