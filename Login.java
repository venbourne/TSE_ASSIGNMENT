/* this code provides methods to interact with a user during the login process. It prompts the user to enter their first name, last name, username, and password, and reads the inputs using Scanner. However, the askUser method is currently empty and doesn't perform any specific functionality.*/


package crs;
import java.util.Scanner;

public class Login extends User{
	public static void askUser() {
		
	}
	
	
	@Override
	public void firstName() {
		Scanner input = new Scanner(System.in);
		System.out.print("First Name: ");
		String firstName = input.nextLine();
		
	}

	@Override
	public void lastName() {
		Scanner input = new Scanner(System.in);
		System.out.print("Last Name: ");
		String lastName = input.nextLine();
	}

	@Override
	public void username() {
		Scanner input = new Scanner(System.in);
		System.out.print("Username: ");
		String username = input.nextLine();
	}

	@Override
       public void password() {
	Scanner input = new Scanner(System.in);
	System.out.print("Password: ");
	
	// Prompt the user to enter their password
	String password = input.nextLine();
}
	
	
	
	
	

	
}
