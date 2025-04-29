package Logical_Programs;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatechar2 {

	public static void main(String[] args) {

		String str="aaaabbbccc";
		
		Set<Character> sh= new HashSet<>();
		
		StringBuffer sb= new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			Character ch= str.charAt(i);
			if(!sh.contains(ch)) {
				sh.add(ch);
				sb.append(ch);
			}}
		System.out.println(sh);
	}}
