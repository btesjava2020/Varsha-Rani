package myproject;

public class fizzbuzz {

	public static void main(String[] args) {
		int a=15;
		if(a%3==0 && a%5==0)
		{
			System.out.println ("fizz buzz");
		}
		else if(a%3==0)
		{
			System.out.println("fizz");
		}
		else if(a%5==0) {
			System.out.println("buzz");
		}
		else {
			System.out.println(a);
		}
	}

}
