package myproject;

public class Sorted {

	public static void main(String[] args) {
		Boolean flag;
		flag=true;
		int[]arr= {11,12,15,20,25};
		for(int i=0;i<=arr.length-2;i++){
			if(arr[i]>arr[i+1]) {
				flag=false;
			}
		}
		if(flag==true) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}


}
