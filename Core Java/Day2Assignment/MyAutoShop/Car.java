package assignment;

public class Car {
	int speed;
	static double RPrice;
	String color;
	
	public Car(){
		
	}
	
	public Car(int a, double b, String c){
		this.speed = a;
		this.RPrice = b;
		this.color = c;
	}
	
	public double getSalePrice(float percent) {
		double gst = percent/100;
		
		double totalgst = gst * RPrice;
		double total = totalgst + RPrice;
		return total;
	}
	public void display() {
		System.out.println("Car Speed: "+speed);
		System.out.println("Car Price : "+RPrice);
		System.out.println("Car Color : "+color);
	}

}