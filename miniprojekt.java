package mp1;

import java.util.Scanner;

public class miniprojekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String test = "hej";
//		System.out.println(test=="hej");

		Scanner sc = new Scanner(System.in);
		while (true) {
			long random = Math.round(Math.random() * 100);
			System.out.println("type a number between 1-100 " + random);
			int numbers = 0;

			for (int i = 0; i < 100; i++) {
				numbers++;
				int guess = sc.nextInt();

				String guessResult = ranNumber(guess, random);
				System.out.println(guessResult);
				if(guessResult == "that´s correct") {
						System.out.println("You needed " + numbers + " guesses ");
						break;	
				}
				
			}
		}

	}

	static String ranNumber(int guess, long random) {
		if (guess < random) {
			return "guess higher";
		} else if (guess > random) {
			return "guess lower";
		} else {
			return "that´s correct";

		}
	}

}
