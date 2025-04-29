package Logical_Programs;

public class Revstring {

	public static void main(String[] args) {

		//WAP TO REVERSE
		String Str = "Hello good evening";
		//output--gnineve doog olleH
		
		
		int len=Str.length();
		String Rev="";
        System.out.println(Str);
		
        for(int i=len-1; i>=0; i--) {
			Rev=Rev+Str.charAt(i);
		}
		System.out.println(Rev);
		
		
//		//WAP to reverse
//		String str= "velocity";
//              // o/p= YTICOLEV
//				
//		int len= str.length();
//		String Rev= "";
//		
//		for(int i=len-1; i>=0; i--) {
//			Rev= Rev+str.charAt(i);
//		}
//		System.out.println(Rev.toUpperCase());
		
		
		
		
		
		
		
		
	
	}

}
