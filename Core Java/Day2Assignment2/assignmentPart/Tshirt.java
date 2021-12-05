package assignmentPart;

public class Tshirt {
	String color;
	String material;
	String design;
	
	Tshirt (String col,String mat,String des) {
		this.color=col;
		this.material=mat;
		this.design=des;
	}
		public void display() {
			System.out.println(color);	
			System.out.println(material);	
			System.out.println(design);	
	}
		
		public static void main(String args[]) {
			Tshirt small = new Tshirt("Red","Rayon","Round");
			Tshirt large = new Tshirt("Pink","Poly","V Shaped");
			Tshirt Xs = new Tshirt("Brown","Nylon","Sleeves");
			
		System.out.println("Small Tshirt design " + small.color+" "+ small.design+ " "+ small.material);
		System.out.println("Large Tshirt design " + large.color+" "+ large.design+ " "+ large.material);
		System.out.println("Xs Tshirt design " + Xs.color+" "+ Xs.design+ " "+ Xs.material);
		}
	

}


