package pkg.tuxi;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		String userChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Bạn muốn ra gì? (kéo - búa - bao");
		userChoice = input.nextLine();
		userChoice = userChoice.toLowerCase();
		
		System.out.println(userChoice);
	}
}
