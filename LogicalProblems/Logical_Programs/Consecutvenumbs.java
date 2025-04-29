package Logical_Programs;

import java.util.Scanner;

public class Consecutvenumbs {

	public static void main(String[] args) {

		Scanner sc1= new Scanner (System.in);
		System.out.println("Enter 1st numb");
		int num1=sc1.nextInt();
		
		Scanner sc2 =new Scanner  (System.in);
		System.out.println("Enter 2nd numb");
		int num2= sc2.nextInt();
		
		Scanner sc3 =new Scanner  (System.in);
		System.out.println("Enter 3rd numb");
		int num3= sc3.nextInt();
		
		if((num2-num1==1)&&(num3-num2==1)) {
          System.out.println("the numbers are consecutive");			
		}
		else
		{System.out.println("the numbers are not consecutive");
	}

}}
