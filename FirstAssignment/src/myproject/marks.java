package myproject;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m= 30;
	if (m>=80) {
		System.out.print("marks is>= 80=");
		System.out.println("excellant");
		}
	else if (m>=70 && m<80) {
		System.out.print("marks>=70 && m<80=");
		System.out.println("very good"); 
		}
	else if(m>= 50 && m<70) {
		System.out.print("marks>= 50 && m<70=");
	    System.out.println("good");
	    }
	 else if(m>=40 && m<50) {
	    System.out.print("marks>=40 && m<50=");
	    System.out.println("average");
	    }
	 else  {
		 System.out.print("marks<40=");
	     System.out.println("fail");
	     }
	
	 }
}


