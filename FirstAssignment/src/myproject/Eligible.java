package myproject;

public class Eligible {

	public static void main(String[] args)
	{
		int age=28;char gender='f';
	
	if(age>=18 && gender=='f') {
		System.out.println("Eligible for marriage");
	}
	else if(age>=21 && gender=='m')
	{
		System.out.println("Eligible for marriage");
	}
	else {
		System.out.println("Not Eligible for marriage");
	}

}
}