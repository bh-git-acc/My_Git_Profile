package Logical_Programs;

public class FirstCharOFString_OFeachWord {

	public static void main(String[] args) {

		String str="My Name Is Madhulika ";
		//op=  M N I M
		
		//str = str + " ";
		String str1="";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isWhitespace(ch)) {
				System.out.println(str1.charAt(0));
				str1="";
			}
             else {
			       str1=str1+ch;
			     }
		    }
	}}
