package Logical_Programs;

public class leapyear {

	public static void main(String[] args) {

		int year=2012;
		if((year %4==0) && (year%100!=0) ||(year%400 == 0)) {
			System.out.println(year+"--Is a leap year ");
		}
		else {
			System.out.println(year+"---Is not a leap year");
		}}}
