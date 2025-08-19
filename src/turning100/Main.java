package turning100;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your birth year: ");
		
		int birth_year = scanner.nextInt();
		
		System.out.println("You will turn 100 in "+(birth_year + 100));
		
		scanner.close();
	}
}
