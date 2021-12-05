package assignment;

public class MyOwnAutoShop {
	public static void main(String[] args) {
		Car c = new Car(100,200000,"white");
		Sedan s = new Sedan(30);
		Ford f1 = new Ford(1150,30000,"Maroon",2015,70f);
		Ford f2 = new Ford(350,70000,"Black",2020,30f);
		System.out.println("Car");
		c.display();
		System.out.println("Sale Price of Car : "+c.getSalePrice(19000));
		
		System.out.println("\n");
		System.out.println("Sedan");
		s.display();
		System.out.println("Length of Sedan : "+s.length);
		System.out.println("Price of Sedan : "+s.getSalePrice());
		
		System.out.println("\n");
		System.out.println("Ford 1");
		f1.display();
		System.out.println("Year of Ford : "+f1.year);
		System.out.println("Ford Manufacture Discount : "+f1.Discount);
		System.out.println("Sale Price of ford1 : "+f1.getSalePrice());
		
		System.out.println("\n");
		System.out.println("Ford 2");
		f2.display();
		System.out.println("Year of Ford : "+f2.year);
		System.out.println("Ford Discount : "+f2.Discount);
		System.out.println("Sale Price of ford2 : "+f2.getSalePrice());
	}



}
