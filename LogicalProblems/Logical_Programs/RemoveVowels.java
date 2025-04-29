package Logical_Programs;

public class RemoveVowels {

	public static void main(String[] args) {

		String input= "Hello World";
		
		String str="";
		for(int i=0; i<input.length(); i++) {
			char c= input.charAt(i);
			
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				continue;
			}
			str=str+c;
		}
		System.out.println(str);
	}}
