package Logical_Programs;

public class RevEachWordInString {

	public static void main(String[] args) {

		String str = "Hello good evening";
		            //olleH doog gnineve
		
		String []word =str.split(" ");
		
		for(String Words: word) {
			String RevWord ="";
			for(int i=Words.length()-1; i>=0; i--) {
				RevWord= RevWord+Words.charAt(i);
			}
		
			System.out.print(RevWord+" ");
			
			
	}}}
