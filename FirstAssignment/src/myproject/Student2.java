package myproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student2 {
	String reg_id;
	float marks;
	String name;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Student2  () throws IOException{
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
		public static void main(String[] args)throws IOException {
			// user input
			System.out.println("Enter detail of first student:");
	Student s1=new Student();
	System.out.println("Enter detail of second student:");
	Student s2=new Student();
	System.out.println("enter detail of third student");
	Student s3=new Student();
	System.out.println();
	System.out.println("detail of first student:");
	s1.disp();
	System.out.println("detail of second student:");
	s2.disp();
	System.out.println("detail of third student");
	s3.disp();


		}
		
	}

   