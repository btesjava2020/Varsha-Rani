package myproject;

public class Patteren7 {

	public static void main(String[] args) {
		int S=4,l=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=S;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=l;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			S--;
			l+=2;
		}

	}

}
