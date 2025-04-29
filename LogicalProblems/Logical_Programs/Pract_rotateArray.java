package Logical_Programs;

import java.util.Arrays;

public class Pract_rotateArray {
//array left rotate
	public static void main(String[] args) {
		
		int[] arr = { 12, 24, 36, 48, 60, 72 };
		// o/p 36,48,60,72,12,24
		
		int n=arr.length;
		int positions=2;
		positions= positions%n;
		int []temp= new int [positions];
		
		for(int i=0; i<positions; i++) { //store the first element in temp 
			temp[i]=arr[i];
		}
		for(int i=0; i<n-positions; i++) {  //shiftrest of the array
			arr[i]=arr[i+ positions];
		}
		for(int i=0; i<positions; i++) { // moved the stored element to end
			arr[n-positions+i]=temp[i];
		}
		System.out.println(Arrays.toString(arr));
	}}
