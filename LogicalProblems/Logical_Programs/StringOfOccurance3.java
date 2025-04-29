package Logical_Programs;

import java.util.HashMap;
import java.util.Map;

public class StringOfOccurance3 {

	public static void main(String[] args) {

		String s1="Nagpur,Pune,Mumbai,Pune,Hydrabad,Nagpur,Nagpur";
		
		String[] word  = s1.split(",");
		
		HashMap<String,Integer> count= new HashMap<String,Integer>();
		
		for(String WORDS : word) {
			if(count.containsKey(WORDS)) {
				count.put(WORDS, count.get(WORDS)+1);
			}
			else {
				count.put(WORDS, 1);
			}}
		for(Map.Entry <String,Integer> entry : count.entrySet()) {
			if(entry.getValue()>0) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}}
		}}
