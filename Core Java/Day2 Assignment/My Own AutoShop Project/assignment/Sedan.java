package assignment;

public class Sedan extends Car {
	int length;

public Sedan(int a){
	this.length = a;
}

public double getSalePrice() {
	if(this.length>20) {
		return super.getSalePrice(5f);
	}
	else {
		return super.getSalePrice(10f);
	}
}

public static void main(String[] args) {
	Sedan sd = new Sedan(30);
	
	Car.RPrice = 19000;
	
	System.out.println("If l > 20 feet, 5% discount,else 10% discount..");
	System.out.println(sd.getSalePrice());
}
}


