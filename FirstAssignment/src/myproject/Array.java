package myproject;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in) ;
int[] array;
array =new int[5];
for( int i=0;i<array.length;i++) 
{
array[i]=s.nextInt();}
for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}
	}
}

