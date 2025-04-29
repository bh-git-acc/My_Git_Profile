package Logical_Programs;

public class Array_rev_order {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(arr.length);

//		System.out.println("original array");
//
//		for (int i = 0; i <arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		System.out.println("Rev array");

		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}
