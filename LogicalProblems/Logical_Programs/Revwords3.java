package Logical_Programs;

public class Revwords3 {
	
	    public static void main(String[] args) {
	        // Original string
	        String originalString = "Hello good evening";
	                         //op = Hello good gnineve

	        // Split the string into words
	        String[] words = originalString.split(" ");

	        // Reverse the word "evening"
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].equals("evening")) {
	                words[i] = new StringBuilder(words[i]).reverse().toString();
	            }
	        }

	        // Join the words back into a single string
	        String modifiedString = String.join(" ", words);

	        // Output the modified string
	        System.out.println(modifiedString);
	    }
	}



