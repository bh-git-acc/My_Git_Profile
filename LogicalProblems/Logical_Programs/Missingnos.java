 package Logical_Programs;

import java.util.HashSet;

public class Missingnos {

	public static void main(String[] args) {
		
		int arr[]= {0,3,4,6,7,8};
		
		HashSet<Integer> Hs= new HashSet<>();
		for(int num: arr) {
			Hs.add(num);
		}
//		int len=arr.length+1;
//		for(int i=0; i<len-1; i++) {
//			if(!Hs.contains(i)) {
//				System.out.println(i);
//			}} 
	

		// to print all nos, missing+existing
		for(int j=0; j<=8; j++) {
		if(!Hs.contains(j)) {
			System.out.println(j);}
			
		} 
		
	}}
