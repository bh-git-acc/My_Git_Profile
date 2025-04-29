package Logical_Programs;

public class Pract_descArray {

	public static void main(String[] args) {
		
		int[] arr = {12, 24, 36, 48, 60, 72};

		int temp=0;
		
        for(int i=0;i<arr.length; i++) {
        	for(int j=1+i; j<arr.length; j++) {
        		if(arr[i]>arr[j]) {
        			temp= arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}}
        for(int i=arr.length-1; i>=0; i--) {
        	System.out.println(arr[i]);
        }
		
	}

}
