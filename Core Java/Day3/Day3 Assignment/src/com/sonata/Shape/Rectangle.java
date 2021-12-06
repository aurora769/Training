package com.sonata.Shape;

public class Rectangle extends Shape{
	public Rectangle( double height, double width) {
		// TODO Auto-generated constructor stub
		super(height,width);
	}
	//Overriding Method
	public double CalArea() {
		double area =this.lengt *this.widt;
		return area;
	}
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(3,4);
		System.out.println("Area of Triangle : "+rect.CalArea());
	}
}


