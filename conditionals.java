import Project1;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
//		int a = 95;
//		int b = 85;
//		int c = 89;
//		int d = 96;
//		
//		float ave = (a + b + c + d) / 4 ;
//		System.out.println(ave);
		
		Scanner grades = new Scanner(System.in);
		
		System.out.print("Math    : ");
		float math = grades.nextFloat();
		System.out.print("Science : ");
		float science = grades.nextFloat();
		System.out.print("English : ");
		float english = grades.nextFloat();
		System.out.print("Computer: ");
		float computer = grades.nextFloat();
		
		float ave = (math + science + english + computer) / 4;
		
		System.out.println("Average: " + ave);
		
		if(ave > 100) {
			System.out.print("Invalid Grade");
		}else if(ave >= 98) {
			System.out.print("With Highest Honors");
		}else if(ave >= 95){
			System.out.print("With High Honors");
		}else if(ave >= 90) {
			System.out.print("With Honors");
		}else if(ave >= 75) {
			System.out.print("Passed");
		}else {
			System.out.print("Failed");
		}

	}

}
