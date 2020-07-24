import java.util.Scanner; //Imports scanner class
import java.util.Random; //Imports random number generator
public class AgeGuess {

	public static void main(String[] args) {
		Scanner guess = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String userName = guess.nextLine(); //user input for name
		System.out.println("Name is: " + userName);
		System.out.println("Enter age guess: ");
		Random rand= new Random();
		int age=rand.nextInt(101); //Randomizes value from 0 to 100
		while (true) {
			int ageGuess = guess.nextInt(); //user input for age
			System.out.println("Age guess is: " + ageGuess);
			if (age != ageGuess) { //checks to see if user input was incorrect
				System.out.println("You guessed wrong!");
				System.out.println("Guess again!");
				if (age > ageGuess) {
				System.out.println("Guess older");//Ask user to input an older age
					}
				else {
					System.out.println("Guess younger"); //Ask user to input a younger age
					}
				}
			if (age == ageGuess) {
				System.out.println("You guessed correctly!!!"); //checks to see if user input is correct
				guess.close();
				break; //closes loop
			}
		}
	}
}
		
	