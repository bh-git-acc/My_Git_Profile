package Logical_Programs;

public class integer {

	public static void main(String[] args) {

//		int i=1;
//		int j=i; //j=1
//		//i++    //i= 1++=2
//		System.out.println(i);
//		System.out.println(j);
	
//		int i=1;
//		int j=++i;//++1=2=j 
//		          //++1=2=i
//		System.out.println(i);
//		System.out.println(j);
		
//		int i=5;
//		int j=i++ + ++i;
	//	int j=i(++) + ++i;
		  //j=5  + 7 (++++)   =12
		//  i=7
		
		
		int i=2;  
		int j=++i; //j=++--> j+1--> j+1+2-->j=3
	               // i=++i--> 1+2-->3=i
		
		System.out.println(i); //3
		System.out.println(j); //3
		System.out.println();
		
		int k=2;   
		int l=k++; //l=2 ???????//(2+1=3)
		           //k=2+1=3
		
		System.out.println(k); //3
		System.out.println(l); //2
		
	}}
