package myproject;
import java.io.*;
//instance variables
public class Student {
String reg_id;
float marks;
String name;
public String getReg_id() {
	return reg_id;
}
public void setReg_id(String reg_id) {
	this.reg_id = reg_id;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Student() throws IOException{
	System.out.println("enter registration id:");
	reg_id=br.readLine();
	System.out.println("enter name:");
	name=br.readLine();
	System.out.println("enter marks:");
	marks=Float.parseFloat(br.readLine());

}
//instance methods
public void disp() {
	System.out.println("Reg_ID="+reg_id+" "+"name="+name+" "+ "marks="+marks);
}
	//public static void main(String[] args)throws IOException {
		// user input
		//System.out.println("Enter detail of first student:");
//Student s1=new Student();
//System.out.println("Enter detail of second student:");
//Student s2=new Student();
//System.out.println("enter detail of third student");
//Student s3=new Student();
//System.out.println();
//System.out.println("detail of first student:");
//s1.disp();
//System.out.println("detail of second student:");
//s2.disp();
//System.out.println("detail of third student");
//s3.disp();


	}
	

