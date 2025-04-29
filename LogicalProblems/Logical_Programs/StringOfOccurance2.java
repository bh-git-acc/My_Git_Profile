package Logical_Programs;

import java.util.HashMap;
import java.util.Map;

public class StringOfOccurance2 {

	public static void main(String[] args) {

		String str="Train,Bus,Train,Aeroplane,Train,Bus";
		//op=   Train count     =3
		//      Bus count       =2
		//      Aeroplane count =1
		
		String word[]= str.split(",");
		HashMap<String,Integer> count= new HashMap<String,Integer>();
		
		for(String Words:word) {
			if(count.containsKey(Words)) {
				count.put(Words, count.get(Words)+1);
			}else{
			     count.put(Words, 1);
			     }}
			for(Map.Entry<String,Integer>entry:count.entrySet()) {
				if(entry.getValue()>0) {
					System.out.println(entry.getKey()+"="+entry.getValue());
				}}
		}}
