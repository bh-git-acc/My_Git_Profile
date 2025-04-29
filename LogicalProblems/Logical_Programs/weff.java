package Logical_Programs;

public class weff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,3,4,5};
        int [] arr2= {6,7,8,9};
        
        StringBuilder sb= new StringBuilder();
        
        for(int num:arr1){
            sb.append (num);
            }
        for(int num:arr2){
            sb.append (num);
        }
        int arr3= Integer.parseInt(sb.toString());
        System.out.println(arr3);

	}

}
