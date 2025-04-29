package Logical_Programs;

import java.util.Arrays;

public class MoveZeroToLeftSide {

	public static void main(String[] args) {


		int ip []= {1,2,0,5,4,0,6,2,0,0,7};
		  //output=0,0,0,0,1,2,5,4,6,2,7
		  
		  int nzcount=0;
		  int newip[]= new int[ip.length];
		  
		  for(int num: ip){
		      if(num!=0){
		         newip[nzcount]=num;
		         nzcount++;
		      }}
		      String str= Arrays.toString(newip);
		      String rev="";
		      for(int i=str.length()-2; i>0; i--){
		          rev= rev+str.charAt(i);
		      }
		      System.out.println(rev);
		     // System.out.println(str);
		}}


