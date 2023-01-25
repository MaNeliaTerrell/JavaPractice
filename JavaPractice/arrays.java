package JavaPractice;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		String studentNames[] = {"Ana","Lia","Jen"};

			int nums[] = {1, 2, 3, 4, 5};
			
		//Declaring without values
			
		//String studentNames[] = new String[3];
		//int evenNumbers[]= new int[5];	
			
			//Accessing Arrays
			
			System.out.println(studentNames[1]); //Lia
			
			//Math operation while accessing array
			
			System.out.println(nums[2] + nums[4]);
			
		//Assigning Elements or replacing the element
			studentNames[0] = "Nelia";
			System.out.println(studentNames[0]);
			
			Scanner user = new Scanner(System.in);
			user.close();
			String newList[]= new String [10];
			System.out.print("Enter newList: ");
			newList[3] = user.nextLine();
			
			System.out.println(newList[3]);
			
			//Exercise; Create 3 arrays that will hold 5 user's credentials:
			//email
			//username
			//password
			
			//Output the user's credentials by using an int variable as an index;
			
			String email[] = {"lia@yahoo.com","gem@gmail.com"};
			String username[]= {"lia", "Gem"};
			String password[]= {"lia123", "gem345"};
			
			int i = 1;  // create a variable to hold the index of the array that 
						//you wanted to show in the console and no need to put index nth times
			
			System.out.println("Index: " + i);
			System.out.println("Email: " + email[i]);
			System.out.println("Username: " + username[i]);
			System.out.println("Password: " + password[i]);
			
			
			
	}

}
