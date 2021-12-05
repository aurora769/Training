package com.sonata1;

public class StudentExample
{
	
	int stdId;
	int stdMarks;
	String stdName;

	StudentExample(int a,int b,String name){
		this.stdId = a;
		this.stdMarks= b;
		this.stdName=name;
		}
	StudentExample()
	{}
	

public void display()
{
	System.out.println(stdId);
	System.out.println(stdMarks);
	System.out.println(stdName);
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	StudentExample b1=new StudentExample();
	b1.stdId=123;
	b1.stdMarks=76;
	b1.stdName="Namrata";
	b1.display();
	
	StudentExample b2 = new StudentExample(123,76,"Namrata");//constructor

	b2.display();

}




}



		