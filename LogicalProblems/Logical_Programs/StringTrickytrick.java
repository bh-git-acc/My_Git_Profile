package Logical_Programs;

public class StringTrickytrick {

	public static void main(String[] args) {

		String Test ="Java_Automation_Python";
		String [] T1 =Test.split("_");
		System.out.println(T1[0]);  //Java
		System.out.println(T1[0].length()); //4
		
		String Test1 ="JavaJaAutomationJaPython";
		String[]T2 = Test1.split("Ja");
		System.out.println(T2[0]); //null
		System.out.println(T2[0].length());//0
        System.out.println(T2[1]); //va
        System.out.println(T2[1].length());//2
	}}
