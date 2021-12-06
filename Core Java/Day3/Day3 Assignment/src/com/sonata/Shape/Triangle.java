package com.sonata.Shape;

public class Triangle extends Shape {
	public Triangle(double length, double height, double width) {
		// TODO Auto-generated constructor stub
		super(length,height,width);
	}
	//Overriding Method
	public double CalArea() {
		double area = 0.5 * (this.widt * this.heigh);
		return area;
	}
	public static void main(String[] args) {
		Triangle triang = new Triangle(2,3,4);
		System.out.println("Area of Triangle : "+triang.CalArea());
	}
}


