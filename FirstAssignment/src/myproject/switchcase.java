package myproject;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int marks=77;
		int m=marks/10;
		switch(m)
		{
		case 10:
		case 9:
		case 8:
			System.out.println("Excellent");
			break;
		case 7:
			System.out.println("very good");
			break;
		case 6:
		case 5:
			System.out.println("Good");
			break;
		case 4:
			System.out.println("average");
			break;
		default:
			System.out.println("better luck");
		}
	}
		}