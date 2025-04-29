package Logical_Programs;

public class concat_wo_concat {

	public static void main(String[] args) {

		 String str1 = "Hello";
	     String str2 = " World";
	        
	        StringBuilder sb= new StringBuilder();
	        sb.append(str1);
	        sb.append(str2);
	        
	        String concat= sb.toString();
	        System.out.println(concat);
	        
	        
	       String str3= str1.concat(str2);
	       System.out.println(str3);
	}}
