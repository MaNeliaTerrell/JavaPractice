package JavaPractice;
import java.util.Scanner;
public class oneFunctionCalc {

	public static void main(String[] args) {
		float x;
		float y;
		
		Scanner scan = new Scanner(System.in);
		scan.close();
		System.out.print("Enter x: ");
		
		x = scan.nextFloat();
		System.out.print("Enter y: ");
		
		y = scan.nextFloat();
		
		System.out.println(x*y);

	}

}
