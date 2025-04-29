package Logical_Programs;

public class RemoveSpecialChar2 {

	public static void main(String[] args) {

		String input= "Hello!@#$% ^$#$%World";
		
		StringBuilder result= new StringBuilder();
		
		for(int i=0; i<input.length(); i++) {
			char ch= input.charAt(i);
			
		//Check if the character is a letter or digit
			
		if(Character.isLetterOrDigit(ch)||Character.isWhitespace(ch)) {
				result.append(ch);
			}}
		String test= result.toString();
		System.out.println(test);
 }}
