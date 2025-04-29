package Logical_Programs;

import java.util.Scanner;

public class FebonacciSeries {

	public static void main(String[] args) {
// o/p-- 0 1 1 2 3 5 8 13 21 34 55...
		
		int a=0, b=1, c;
		
		System.out.println("Enter a term");
		Scanner sc = new Scanner(System.in);
		int term=sc.nextInt();
		         //  1<=5
		         //  2<=5
		         //  3<=5
		         //  4<=5
		         //  5<=5
		         //  6<=5  fail
		for(int i=0; i<=term; i++) {
			System.out.print(a+" "); // 0  1  1  2  3  5
			c=a+b;                   //c=1 2  3  5  8  13
			a=b;                    // a=1 1  2  3  5  8
			b=c;                    // b=1 2  3  5  8  13
		}
	}}
