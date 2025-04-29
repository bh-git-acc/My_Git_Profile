package Logical_Programs;

import java.util.Arrays;

public class anagrampractise {

	public static void main(String[] args) {

	      
	       String str = "race";
	       String str2 = "care";
	       
	      if(str.length()==str2.length()){
	          char [] char1= str.toCharArray();
	          char [] char2= str2.toCharArray();
	          
	          Arrays.sort(char1);
	          Arrays.sort(char2);
	          
	         boolean Result= Arrays.equals(char1,char2);
	         if(Result){System.out.println("race and care are anagram");}
	         else{System.out.println("not an anagram");}
	      }}
	}


