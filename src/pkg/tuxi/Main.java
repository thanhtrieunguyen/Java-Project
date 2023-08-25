package pkg.tuxi;

import java.util.Scanner;

public class Main {
	String getComputerChoice() {
		String computerChoice;
		int randomNumber;
		randomNumber = (int) (Math.random()*3) + 1; 
		if(randomNumber == 1) {
			computerChoice = "keo";
		}
		else if (randomNumber == 2) {
			computerChoice = "bua";
		}
		else computerChoice = "bao";
		
		return computerChoice;
	}
	
	String getUserChoice() {
		String userChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Bạn muốn ra gì? (kéo - búa - bao) (không dấu)");
		System.out.println("Ví dụ: keo - bua - bao");
		System.out.println("=======================");
		System.out.println("Bạn chọn: ...");
		userChoice = input.nextLine();
		userChoice = userChoice.toLowerCase();
		
		return userChoice;
	}
	
	
	String getResult(String userChoice, String computerChoice) {
		String result = "";
		if (userChoice.equals(computerChoice)) {
			result = "Hoà";
		}
		else if (userChoice.equals("keo") && computerChoice.equals("bao")) {
			result = "Thắng";
		}
		else if (userChoice.equals("bua") && computerChoice.equals("keo")) {
			result = "Thắng";
		}
		else if (userChoice.equals("bao") && computerChoice.equals("bua")) {
			result = "Thắng";
		}
		else {
			result = "Thua";
		}
		return result;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		String userChoice;
		while(true) {
			userChoice = obj.getUserChoice();
			if(userChoice.equals("keo") || userChoice.equals("bua") || userChoice.equals("bao")) {
				break;
			}
		}
		
		String computerChoice = obj.getComputerChoice();
		String result = obj.getResult(userChoice, computerChoice);
		System.out.println("Bạn đã chọn là: " + userChoice);
		System.out.println("Máy đã chọn là: " + computerChoice);
		
		System.out.println("Kết quả: " + result);
	}
}
