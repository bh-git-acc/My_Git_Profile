package Logical_Programs;

public class Revwords_Revletters {
	public static void main(String[] args) {
		String str = "Hello good evening";
		//  output =  evening doog Hello
		
        // Split the string into an array of words
        String[] words = str.split(" ");
        
        // Initialize a StringBuilder to hold the result
        StringBuilder reversedStr = new StringBuilder();
        
        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            
//for output as-- evening good Hello
           //reversedStr.append(word);  //and skip below code
            
           // Reverse each word except for the first and the last word or any ther word
//output-- evening doog Hello
            if (i == 0 || i == words.length - 1) {
                reversedStr.append(word);
            } else {
                reversedStr.append(new StringBuilder(word).reverse().toString());
            }
       // Reverse each word after this just change || to && 
//output as-- gnineve doog olleH
//            if (i == 0 && i == words.length - 1) {
//                reversedStr.append(word);
//            } else {
//                reversedStr.append(new StringBuilder(word).reverse().toString());
//            }
         // Add a space between words
            if (i != 0) {
                reversedStr.append(" ");
            }
        }
        
        // Print the resulting string
        System.out.println(reversedStr.toString());
	    }}
	



