package Logical_Programs;

import java.util.Arrays;

public class rotate_Array {

	public static void main(String[] args) {
		int[] arr = { 12, 24, 36, 48, 60, 72 };
		// o/p 36,48,60,72,12,24

		int positions = 2;
		int n = arr.length;

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
		System.out.println(Arrays.toString(arr));
	}

}
