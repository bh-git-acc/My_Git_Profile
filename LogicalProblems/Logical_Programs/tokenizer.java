package Logical_Programs;

import java.util.StringTokenizer;

public class tokenizer {
	public static void main(String[] args) {
		
		StringTokenizer st= new StringTokenizer("Readme I am string");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	System.out.println();
		String str= "My name is Madhulika Bhalerao";
		StringTokenizer st1= new StringTokenizer(str);
		System.out.println(st1.countTokens());
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
	   
		System.out.println();
		String str2= "My name is Madhulika Bhalerao";
	     String []str3= str2.split(" ");
	     for(String str4:str3) {
	    	 System.out.println(str4);
	     }
		
	}}
