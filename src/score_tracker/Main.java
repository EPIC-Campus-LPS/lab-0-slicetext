package score_tracker;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static List<Integer> scores = new ArrayList<>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			scores.add(scanner.nextInt());
		}
		int total = 0;
		// Get total score
		for(int i=0; i<scores.size(); i++) {
			total += scores.get(i);
		}
		
		System.out.println("Total Score: " + total);
		System.out.println("Average Score: " + (total / 3));
		System.out.println("Stars Earned: " + (total % 5));
	}
}
