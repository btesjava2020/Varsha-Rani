package myproject;
import java.util.Scanner;

public class Palingdromestring {

	public static void main(String[] args) {
		String reverse="";
		System.out.println("Enter the input string");
		Scanner s= new Scanner(System.in);
		String original=s.nextLine();
		for(int i = original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("Given string is paligdrome");
			{
				System.out.println("Given string is not paligdrome");
			}
		}
		

	}

}