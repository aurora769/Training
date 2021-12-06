package com.sonata.Shape;

public class Shape {
	double lengt;
	double heigh;
	double widt;
	 
	public Shape(double le, double hei, double wid) {
		this.lengt = le;
		this.heigh = hei;
		this.widt = wid;
	}
	public Shape(double le) {
		this.lengt = le;
	}
	public Shape(double le, double wid) {
		this.lengt = le;
		this.widt = wid;
	}
	public double CalArea() {
		return 0;
	}
}


