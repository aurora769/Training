package Namrata;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade='A';
		switch(grade)
		{
		case 'A':
			System.out.println("Success");
			break;
		case 'B':
		case 'C':
			System.out.println("Accomplished");
		default:
			System.out.println("Invalid grade");
		}
		
		

	}

}
