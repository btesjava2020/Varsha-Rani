package myproject;

public class Reverse {

	public static void main(String[] args) {
	String name="varsha";
	String rev = " ";
	int leng = name.length();
	for(int i=leng -1;i>=0;i--)
	{
		rev = rev+name.charAt(i);
	}
	System.out.println("reverse of"+name+"is"+rev);

	}

}
