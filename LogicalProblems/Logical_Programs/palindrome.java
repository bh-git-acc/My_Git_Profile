package Logical_Programs;

public class palindrome {
	public static void main(String[] args) {
	       // System.out.println("Hello, World!");
	       int n= 1234321;
	        int rem=0;
	        int rev=0;
	        int temp=n;
	        while(n!=0){             //1234321!=0               //123432                //12343
	            rem=n%10;            //1234321%10 = 1           //123432%10 = 2         //12343%10 =3
	           rev=rev*10+rem;       //0*10+1 = 1               //1*10+2 = 12            //12*10+3 =123
	           n=n/10;              //n= 1234321/10   n= 123432  //123432/10  n=12343   //123432/10  n=12343
	           }
	        System.out.println(rev);
	        
	        if(temp==rev){
	            System.out.println("number is polidron");
	        }
	        else
	        {System.out.println("number is not polidron");}
	    }
	
//	int n= 1234321;
 //   int rem=0;
  //  int rev=0;
  //  while(n!=0){
   //     rem=n%10;
    //   rev=rev*10+rem;
     //  n=n/10;
       
   // }
 
    //System.out.println(rev); 
}



