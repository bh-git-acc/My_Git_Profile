package Logical_Programs;

public class Pract_A_P {

	public static void main(String[] args) {
//Palindrone no
	
		int n=121;
		int temp=n;
		int rem=0;
		int rev=0;
		
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("number is palindron");
		}else {
			System.out.println("number is not");
		}
	}}
