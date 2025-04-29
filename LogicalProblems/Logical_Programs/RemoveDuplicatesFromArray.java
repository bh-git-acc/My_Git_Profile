package Logical_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArray {

      public static void main(String[] args) {
		//int [] a= {1,3,2,3,5,4,5,1};
		int [] a= {1,2,2,3,3,4,5,5};
		//op= 12345
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(int i=0; i<a.length; i++) {
			hs.add(a[i]);
		}
//		for(int no: hs) {
			
			System.out.println(hs+" ");//[1,2,3,4,5]
//		}
		}}


