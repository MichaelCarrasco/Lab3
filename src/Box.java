
public class Box {
	int size = 0; //sets a starting value for size
	
	public static void main(String[] args) {
		Box stars = new Box();
		stars.size = 5; //changes size to 5
		stars.printBox(); //prints out our star box
	}
	
	public void printBox() {
		for (int i=0;i<size;i=i+1) {  
		for (int j=0;j<size;j=j+1) {
			System.out.print("*");	
			}
			System.out.println();
			}
		}

	}