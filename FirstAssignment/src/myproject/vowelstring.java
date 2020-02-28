package myproject;

public class vowelstring {

	public static void main(String[] args){
		String S = ("Bebo technical education services");
		         
				int count = 0;
		for( int i=0;i<S.length();i++) {
			if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'|S.charAt(i)=='o'||S.charAt(i)=='u') {
				count++;
			}
		}
		  System.out.println("vowles are"+count);
        
	

}
}