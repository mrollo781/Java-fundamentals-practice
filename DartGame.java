package DartGamePractice;

import java.util.Random;
import java.util.Scanner;

public class DartGame {

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String[] args) {
		int totalScore = 0;

		System.out.println("Welcome to the dart game!\n------------------------");
		System.out.println("The rules are simple.\nThere are 5 rounds, you get three throws per round.");

		for (int round = 1; round <= 5; round++) {
			System.out.println("\nRound " + round + "!");
			int roundScore = throwdart();
			totalScore += roundScore;
			displayScore(roundScore, totalScore);
		}
	}

	public static int throwdart() {
		System.out.println("You threw your dart three times");
		int first = rand.nextInt(10) + 1;
		int second = rand.nextInt(10) + 1;
		int third = rand.nextInt(10) + 1;
		int roundScore = first + second + third;
		
		System.out.println("Scores: " + first + ", " + second + ", " + third);
		return roundScore;
	}

	public static void displayScore(int roundScore, int totalScore) {
		System.out.println("Round score: " + roundScore);
		System.out.println("Total score so far: " + totalScore);
	}
}
