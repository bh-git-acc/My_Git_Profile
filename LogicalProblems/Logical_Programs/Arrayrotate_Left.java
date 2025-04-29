package Logical_Programs;

import java.util.Arrays;

public class Arrayrotate_Left {

	public static void main(String[] args) {
		
		 int[] arr = {12, 24, 36, 48, 60, 72};
	        int positions = 4; // Number of positions to rotate
	        int n = arr.length;
// Rotate array to the left
	        positions = positions % n; // In case positions is greater than n
	        int[] temp = new int[positions];
           
	        // Store the first 'positions' elements in temp
	        for (int i = 0; i < positions; i++) {
	            temp[i] = arr[i];
	        }
            // Shift the rest of the array
	        for (int i = 0; i < n - positions; i++) {
	            arr[i] = arr[i + positions];
	        }
            // Move the stored elements to the end
	        for (int i = 0; i < positions; i++) {
	            arr[n - positions + i] = temp[i];
	        }

	        // Print the result
	        System.out.println("Array after left rotation: " + Arrays.toString(arr));

	}

}
