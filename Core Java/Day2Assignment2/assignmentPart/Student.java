package assignmentPart;

public class Student {
	int SId;
	String SName;
	int SClass;
	
	Student() { }
	
	Student (int a,String name,int c) {
		this.SId=a;
		this.SName=name;
		this.SClass=c;
	}
	
	public void display() {
		System.out.println("Student ID " + SId);	
		System.out.println("Student Name " + SName);	
		System.out.println("Student Class " + SClass );	
	}
	
	public static void main(String args[])
	{
	   Student s1=new Student(); //default constructor
	   s1.SId=15;
	   s1.SName="Namrata";
	   s1.SClass=10;
	   s1.display();
	   System.out.println();
	   
	   Student s2 = new Student (16,"rahul",10); 
	   
	   s2.display();
	}

}



