package Logical_Programs;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {

		int num,sum,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a numb"); //23/10= 2.3=   2=num
		 num =sc.nextInt();                 //23%10= rem=3
		                                    //2+3 =sum=5
		for(sum=0; num>1; num=num/10) {
			rem=num%10;
			sum=sum+rem;
		}
	System.out.println("sum of digit is-->"+sum);
	    }}
