package myproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Studentarray {
	String reg_id;
	String name;
	float marks;
	static final String College="YPS";
	private static final Student[][] Student = null;
	Student s6;
	 void Studentarray(String reg,String na,float marks){
		 reg_id=reg;
		 name=na;
		 this.marks=marks;
	}
	 void disp() {
		 System.out.println("Reg_Id="+reg_id+""+"Name="+name+""+"Marks="+marks);
	 }
	 static void cal_highest(Student stud[]) {
		 int highest;
		 System.out.println(stud[0].name);
	 }
	 public static void main(String[] args) throws IOException{
		 int i;String reg,name;float marks;
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			 Studentarray[]stu=new Studentarray[5];
		 for(i=0;i<stu.length;i++) {
			 System.out.println("Enter RegId");
			int reg1=Integer.parseInt(br.readLine());
			 System.out.println("Enter name");
			String name1=br.readLine();
			 System.out.println("Enter marks");
			float  marks1=Float.parseFloat(br.readLine());
			 stu[i]=new Studentarray();
		 }
		cal_highest(Student [i]);
		


		
	}

}
