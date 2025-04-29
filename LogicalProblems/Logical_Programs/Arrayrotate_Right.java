package Logical_Programs;

import java.util.Arrays;

public class Arrayrotate_Right {

	public static void main(String[] args) {

		int[] arr = { 12, 24, 36, 48, 60, 72 };
		int positions = 3; // Number of positions to rotate
		int n = arr.length;

		// Rotate array to the right
		positions = positions % n; // In case positions is greater than n

		int[] temp = new int[positions];

		// Store the last 'positions' elements in temp
		for (int i = 0; i < positions; i++) {
			temp[i] = arr[n - positions + i];
		}
        // Shift the rest of the array
		for (int i = n - 1; i >= positions; i--) {
			arr[i] = arr[i - positions];
		}
        // Move the stored elements to the front
		for (int i = 0; i < positions; i++) {
			arr[i] = temp[i];
		}
		System.out.println("Array after right rotation: " + Arrays.toString(arr));
}}
