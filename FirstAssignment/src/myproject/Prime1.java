package myproject;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean flag  ;int count;
for(int i=1;i<=5;i++) {
	count=1;
	
	for(int j=1;j<=2*i;j++) 
	{
		flag=true;
		for(int k=2;k<j;k++)
		{
			if(j%k==0)
			{
				flag=false;
				break;}
		}
				if(flag==true && count<=i) {
			
				System.out.print(j);
			count++;
					
			
		}
	}
		System.out.println();
		}
	}
	
}
	



