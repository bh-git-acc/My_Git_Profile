package Logical_Programs;

import java.util.Scanner;

public class sumofnaturaloddnums {

	public static void main(String[] args) {

		int sum=0;
		int numb;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		 numb=sc.nextInt();
		 
		 for(int i=1; i<=numb; i++) {
		// System.out.println(2*i-1); 
			 sum=sum+(2*i-1); //(2*i)
		 }
		System.out.println("Sum of natural odd numbers is--"+sum);
}}
