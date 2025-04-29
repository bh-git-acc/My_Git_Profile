 package Logical_Programs;

import java.util.Arrays;

public class Movezerotorightside {

	public static void main(String[] args) {

		int inputseq []= {1,2,0,5,4,0,6,2,0,0,7};
		//exp o/p = 1,2,5,4,6,2,7,0,0,0,0
		
		int nonzerocount= 0;
		int Newarray[]= new int [inputseq.length];
		

	for(int num: inputseq) {
			if(num!=0) {
				Newarray[nonzerocount]= num;
				nonzerocount++;
			}}
		String str = Arrays.toString(Newarray);
		System.out.println(str);
	}}
