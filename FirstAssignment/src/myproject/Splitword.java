package myproject;

public class Splitword {

	public static void main(String[] args) {
		int i=1 ;
		String S =( "Bebo technical education services");
		String S1[]=S.split(" ");
		for (i=0;i<S.length();i++) {
        System.out.println(S1[i]);
	}
  }
}
