package assignmentPart;

public class ProductAssignment {
	int PId;
	String PName;
	double PPrice;
	
	
	ProductAssignment (int id,String name,double price) {
		this.PId=id;
		this.PName=name;
		this.PPrice=price;
	}
	public void display() {
			System.out.println(PId);
			System.out.println(PName);
			System.out.println(PPrice);
	}
	
	public double totPrice(double gst) {
		double total=(this.PPrice+(PPrice*(gst/100)));
			return total;
	}	
		public static void main(String args[]) {
				ProductAssignment p1=new ProductAssignment(678,"abcd",700);
				p1.display();
				System.out.println("gst price is " + p1.totPrice(5));


				}
			

	}	




