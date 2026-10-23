package ClockPractice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClockTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = 0, minute = 0, second = 0;
		Clock c1 = new Clock();
		boolean valid = false;
        
		while (!valid) {
			try {
				System.out.println("Enter start hour : ");
				hour = scan.nextInt();
				System.out.println("Enter start minute : ");
				minute = scan.nextInt();
				System.out.println("Enter start second : ");
				second = scan.nextInt();
				
				if (c1.setHour(hour) && c1.setMinute(minute) && c1.setSecond(second)) {
					valid = true;
				} else {
					System.out.println("Values out of range. Try again.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again");
				scan.next();
			}
		}
		
		System.out.println("Current Time: " + c1);
		c1.tick();
		System.out.println("Time after 1 tick: " + c1);
		System.out.println("12-Hour Format: " + c1.display12H());
        scan.close();
	}
}
