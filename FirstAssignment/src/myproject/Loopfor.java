package myproject;

import java.util.Scanner;

public class Loopfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number ");
int num=scan.nextInt();
int x;
for(int i=1;i<=10;i++)
{
	x=num*i;
	System.out.println(num+ " * "+i+" = "+x);
}
	}

}
