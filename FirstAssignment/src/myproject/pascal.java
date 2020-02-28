package myproject;

import java.util.Scanner;

public class pascal {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row value:");
		    num = sc.nextInt();
		    for(int i=0;i<num;i++) {
		    	for(int j=num;j>i;j--) {
		    		System.out.print(" ");
		    	}
		    	int val = 1;
		    	for(int j=0;j<=i;j++) {
		    		System.out.print(val+" ");
		    		val = val*(i-j)/(j+1);}
		    		System.out.println();
		    	}
		    }

	}


