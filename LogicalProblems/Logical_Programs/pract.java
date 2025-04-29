package Logical_Programs;

import java.util.Arrays;

public class pract {

	public static void main(String[] args) {

		 
	     String str ="race";
	     String str1 ="care";
	     
	     if(str.length()==str1.length()){
	         
	         char [] char1= str.toCharArray();
	         char [] char2= str.toCharArray();
	         
	         Arrays.sort(char1);
	         Arrays.sort(char2);
	         
	         boolean result= Arrays.equals(char1,char2);
	         if(result){
	             System.out.println("are anagram");}
	         else{System.out.println("are not anagram");}
	     }
	}

}
