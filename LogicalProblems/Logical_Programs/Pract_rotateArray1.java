package Logical_Programs;

import java.util.Arrays;

public class Pract_rotateArray1 {
//array right rotate
	public static void main(String[] args) {
		
		int[] arr = { 12, 24, 36, 48, 60, 72 };
		//o/p   [48, 60, 72, 12, 24, 36]
	
        int n= arr.length;
        int positions= 4;
        positions= positions%n;
        int[] temp= new int[positions];
        
        for(int i=0; i<positions; i++) {
        	temp[i]= arr[n- positions + i];
        }
        for(int i=n-1; i>=positions; i--) {
        	arr[i]=arr[i- positions];
        }
        for(int i=0; i<positions; i++) {
        	arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));
	}}
