package home_work;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ZooClub zooClub = new ZooClub();

		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			switch (sc.next()) {
			case "1": {
				zooClub.addClubMember();
				break;
			}
			case "2": {
				zooClub.addAnimalToClubMember();
				break;
			}
			case "3": {
				zooClub.removeAnimalFromClubMember();
				break;
			}
			case "4": {
				zooClub.removeClubMember();
				break;
			}
			case "5": {
				zooClub.removeTypeOfAnimal();
				break;
			}
			case "6": {
				zooClub.printAll();
				break;
			}
			case "7": {
				System.exit(0);
				break;
			}
			}
		}
	}

	public static void menu() {
		System.out.println();
		System.out.println("Enter 1, to add a member to club");
		System.out.println("Enter 2, to add animal to the member of club");
		System.out.println("Enter 3, to remove animal to the member of club");
		System.out.println("Enter 4, to remove member from club");
		System.out.println("Enter 5, to remove type of animal");
		System.out.println("Enter 6, to print all zoo club");
		System.out.println("Enter 7, to exit");
		System.out.println();
	}
}
