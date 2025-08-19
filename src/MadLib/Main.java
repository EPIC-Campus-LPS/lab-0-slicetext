package MadLib;
import java.util.Scanner;

public class Main {
	public static String verb;
	public static String adjective;
	public static String noun;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Verb: ");
		verb = scanner.nextLine();
		System.out.print("Adjective: ");
		adjective = scanner.nextLine();
		System.out.print("Noun: ");
		noun= scanner.nextLine();
		
		System.out.println("They wanted to "+verb+" a "+adjective+" "+noun+" for the science fair.");
		
		scanner.close();
	}
}
