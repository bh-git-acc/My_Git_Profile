package Logical_Programs;

import java.util.Scanner;

public class Armstrongnos {

	public static void main(String[] args) {

		int P,Sum,Rem;
		
		System.out.println("Enter a no");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		P=num; //P=153
		for(Sum=0; num>0; num=num/10) {
			Rem=num%10;        //153%10== 3
							   //15%10== 5
							   //1%10== 1
			Sum=Sum+Rem*Rem*Rem;
			//27 = 0+3*3*3
			//153 = 27+5*5*5
			//153 = 152+1*1*1
		}
		if(Sum== P) { //153==153
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
//		 int sum,rem;
//	      int num=153;
		// int p=num;
//	      
//	      for(sum=0; num>0; num=num/10){
//	          
//	          rem=num%10;
//	          
//	          sum= sum+rem*rem*rem;
//	          System.out.println(sum);
//	      }
//	      if(sum == num){
//	          System.out.println("numbers r armstrong");
//	      }else{
//	          System.out.println("numbers r not armstrong");}
		
	}}
