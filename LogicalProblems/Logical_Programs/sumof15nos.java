package Logical_Programs;

public class sumof15nos {

	public static void main(String[] args) {

		 int Sum=0;
		 for(int i=1; i<=15; i++) {
			Sum=Sum+i;
		 }
		 System.out.println("Sum of 1st 15numbers is-->"+Sum);
		
		 int i=1;
		 int n=15;
		 int sum1=0;
		 while(i<=n) {
			 sum1=sum1+i;
			 i++;
		 }
		
		 System.out.println("sum of first 15 numbers by while loop--"+sum1);		 
		 
	}

}
