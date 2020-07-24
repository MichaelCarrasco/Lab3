import java.util.Scanner;
public class VowelCounter {

	public static void main(String[] args) {
		System.out.print("Enter your string: ");
		Scanner input = new Scanner(System.in);
		String word = input.nextLine(); //user input for age
		
		int av = 0; //starting values for our lower case vowels
		int ev = 0;
		int iv = 0;
		int ov = 0;
		int uv = 0;
		char a = 'a'; //sets our variables = to lower case character vowels
		char e = 'e';
		char ic = 'i';
		char o = 'o';
		char u = 'u';
		
		int Av = 0; //starting values for our upper case vowels
		int Ev = 0;
		int Iv = 0;
		int Ov = 0;
		int Uv = 0;
		char A = 'A'; //sets our variables = to upper case character vowels
		char E = 'E';
		char Ic = 'I';
		char O = 'O';
		char U = 'U';
		
		int sum=0;
		
		for (int i=0; i<word.length(); i=i+1) {
			//checks each character in a string for a vowel and adds it to the counter
			if (word.charAt(i)==a) { 
				av=av+1;
			}
			if (word.charAt(i)==e) {
				ev=ev+1;
			}
			if (word.charAt(i)==ic) {
				iv=iv+1;
			}
			if (word.charAt(i)==o) {
				ov=ov+1;
			}
			if (word.charAt(i)==u) {
				uv=uv+1;
			}
			if (word.charAt(i)==A) {
					Av=Av+1;
			}
			if (word.charAt(i)==E) {
					Ev=Ev+1;
			}
			if (word.charAt(i)==Ic) {
					Iv=Iv+1;
			}
			if (word.charAt(i)==O) {
					Ov=Ov+1;
			}
			if (word.charAt(i)==U) {
					Uv=Uv+1;
			}
			sum=av+ev+iv+ov+uv+Av+Iv+Ev+Ov+Uv; //calculates the total number of vowels in our string
			input.close();
		}
			
		System.out.println("Number of a's = "+ av);
		System.out.println("Number of e's = "+ ev);
		System.out.println("Number of i's = "+ iv);
		System.out.println("Number of o's = "+ ov);
		System.out.println("Number of u's = "+ uv);
		System.out.println("Number of non-vowel characters is "+(word.length()-sum)); //prints out number of non-vowel characters spaces included
		
	}

}