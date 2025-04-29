package Logical_Programs;

public class smallestno {

	public static void main(String[] args) {

		int a=90;
		int b=80;
		int c=40;
		
		if(a<b && a<c ) {
			System.out.println("a is the smallest number");
		}
		else if(b<a && b<c) {
			System.out.println("b is the smallest number");
		}
		else {
			System.out.println("c is the smallest number");
		}
			
	}

}
