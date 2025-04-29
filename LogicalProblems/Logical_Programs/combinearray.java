package Logical_Programs;

public class combinearray {

		    public static void main(String[] args) {
		        int[] arr1 = {1, 2, 3, 4};
		        int[] arr2 = {5, 6, 7};
		        
		        // Step 1: Initialize a StringBuilder to hold the concatenated string
		        StringBuilder sb = new StringBuilder();
		        
		        // Step 2: Append elements of arr1 to the StringBuilder
		        for (int num : arr1) {
		            sb.append(num);
		        }
		        
		        // Step 3: Append elements of arr2 to the StringBuilder
		        for (int num : arr2) {
		            sb.append(num);
		        }
		        
		        // Step 4: Convert the concatenated string to an integer
		        int arr3 = Integer.parseInt(sb.toString());
		        
		        // Output the result
		        System.out.println("arr3 = " + arr3);
		    }
		}


	


