package Logical_Programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatechar {

	public static void main(String[] args) {

		//String str= "Rannjeet";
		String str1="Appleee";
		
		Set<Character> se= new HashSet<>();
		
		StringBuffer sb= new StringBuffer();
		
		for(int i=0; i<str1.length(); i++) {
			Character c= str1.charAt(i);
			if(!se.contains(c)) {
				se.add(c);
				sb.append(c);
				
	}}
		System.out.println(sb);
		
		
	}}
