package Logical_Programs;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		String test ="Te@#$%sti1234ng!@#$% Java";
		//op= Testing Java;
		String NewString = test.replaceAll("[^a-zA-Z]","");
		System.out.println(NewString);
	
	
	String input="Hello!@#$%^&*123 World";
	String newstring= input.replaceAll("[^a-zA-Z]","");
	System.out.println(newstring);
}}
