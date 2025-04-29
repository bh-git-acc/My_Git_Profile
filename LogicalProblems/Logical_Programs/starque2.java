package Logical_Programs;

public class starque2 {

	public static void main(String[] args) {
         
		//******
		//****
		//***
		//**
		//*
		
		//i=rows     sp-5,ep-1 --
		//j=columns  sp-1,ep-5  ++
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
