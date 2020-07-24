import java.util.Scanner;
public class EvenNumSum {

	public static void main(String[] args) {
		System.out.println("Please enter an integer");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt(); //user input for age
		int sum=0;
		if (integer < 2) {
			System.out.println("Error! \nInteger less than two not accepted");
		}
		if (integer >=2) {
			for (int i=2; i<=integer; i=i+2) {
				sum=sum+i;
				input.close();		
			}
			System.out.println("The sum of all even integers between 2 and the input value is: " + sum);
		}
	}

}
