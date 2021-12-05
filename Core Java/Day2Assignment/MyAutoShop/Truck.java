package assignment;
public class Truck extends Car {
	int weight;
	
	
	Truck(int a, double b, String c, int d){
		super(a,b,c);
		this.weight = d;
	}
	
	double getSalePrice() {
		if(this.weight>2000) {
			return super.getSalePrice(10);
		}
		else {
			return super.getSalePrice(20);
		}
	}
	public static void main(String[] args) {
		Truck truc = new Truck(100, 190000, "red",31000);
		
		
		System.out.println(truc.getSalePrice());
	}
}


