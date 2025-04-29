package Logical_Programs;

public class PrimeNumb_verify {

	public static void main(String[] args) {

		int no=7;
		int temp=0;
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				temp=temp+1;
			}}
		if(temp==0) {
			System.out.println(no+"No is a prime");
		}
		else {
			System.out.println(no+"No is not a prime");
		}
	 }}
