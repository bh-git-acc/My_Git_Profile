package Logical_Programs;

public class CommonElement {

	public static void main(String[] args) {

		String arr1[]= {"Java","Pyhton","PHP","C#","C++"};
		String arr2[]= {"SQL","MySQL","Oracle","C#","Java"};
		
	 for(int i=0; i<arr1.length; i++) {
		 for(int j=0; j<arr2.length; j++) {
			 if(arr1[i]==arr2[j]) {
			System.out.println(arr1[i]+" ");}
	}}
}}
