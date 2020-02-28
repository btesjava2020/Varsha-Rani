package myproject;

public class Splitstring {

	public static void main(String[] args) {
		String str="javaExamplesjavaCodejavaProgram";
		int Count=( str.split("java", -1).length ) -1;
		{
			System.out.println("Total occurences:"+ Count);
		
		}
	}

}
