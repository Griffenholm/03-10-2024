import java.util.Scanner;

class Main {

public static void main (String [] args){

	Scanner scan = new Scanner(System.in); // scanner object
	String name;


	System.out.println("Please type your name.");
	name = scan.nextLine();

	System.out.println("Hello " + name + ".\n" + "Please type your age.");
	int age = Integer.parseInt(scan.nextLine()); // Stringen læses nu som int.

	System.out.println("You are " + age + " years old.");
	
	int retire = 67 - age;

	System.out.println("You have " + retire + " years until retirement.");
}
}