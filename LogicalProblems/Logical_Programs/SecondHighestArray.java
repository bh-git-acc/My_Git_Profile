package Logical_Programs;

import java.util.Arrays;

public class SecondHighestArray {

	public static void main(String[] args) {

		int arr[]= {12,3,10,35,1,3,1};
		//output 12
		int n = arr.length;
		
		Arrays.sort(arr);
	
		int second_largest= 0;
		int largest= arr[n-1];
		
		for(int i= n-2; i>=0; i--) {
			if(arr[i]!=largest) {
			second_largest=arr[i];
			  break;
			}}
		System.out.println(second_largest);
	}}
