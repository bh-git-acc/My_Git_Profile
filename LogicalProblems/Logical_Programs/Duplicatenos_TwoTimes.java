package Logical_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Duplicatenos_TwoTimes {

	public static void main(String[] args) {

		int arr[]= {1,2,2,3,2,3,4,5,6,6,6,2,7};
		//[2 3 6]
		
		HashMap<Integer,Integer> count= new HashMap<Integer,Integer>();
		
		for(int num: arr) {
			count.put(num, count.getOrDefault(num,0)+1);
		}
		List<Integer> result= new ArrayList<Integer>();
		
		for(Map.Entry<Integer,Integer>entry : count.entrySet()) {
			if(entry.getValue()!=1) {
				result.add(entry.getKey());
			}}
		System.out.println(result);
	    }}
