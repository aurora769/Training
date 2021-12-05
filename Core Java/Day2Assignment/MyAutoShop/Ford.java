package assignment;

public class Ford extends Car {
	int year;
	float Discount;
	Ford(int speed,double RPrice,String color,int year,float Discount)
	{
		super(speed,RPrice,color);
		this.year=year;
		this.Discount = Discount;
	}
	public double getSalePrice() {
		Car carr = new Car();
	
		double discoun = this.Discount/100;
		
		double totaldiscount = discoun * carr.RPrice ;
		double total = carr.RPrice - totaldiscount;
		
		return total;
	}
	
	public static void main(String[] args) {
	
		Car.RPrice = 90000;
		Ford fr = new Ford(100,90000,"red",2022,20f);
		System.out.println(fr.getSalePrice());

		
		
				
		
	
	}
	

}