import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String fName = input.next();
		System.out.println("What is your last name?");
		String lName = input.next();

		System.out.println("What is your age?");
		int userAge = input.nextInt();

		// If the user’s age is an odd number, then the user will retire in ____
		// years if the user's age is odd, or ___ years if user's age is even.

		System.out.println("Please enter your birth month using 1-12.");
		String birthMonth = input.next();
		String moneyHas = null;
		if (birthMonth != "1" || birthMonth != "2" || birthMonth != "3" || birthMonth != "4" || birthMonth != "5"
				|| birthMonth != "6" || birthMonth != "7" || birthMonth != "8" || birthMonth != "9"
				|| birthMonth != "10" || birthMonth != "11" || birthMonth != "12") {
			moneyHas = "0.00";
		} else {

			switch (birthMonth) {
			case "1":
			case "2":
			case "3":
			case "4":
				moneyHas = "345,000";
			}
			switch (birthMonth) {
			case "5":
			case "6":
			case "7":
			case "8":
				moneyHas = "1 Billion";
			}
			switch (birthMonth) {
			case "9":
			case "10":
			case "11":
			case "12":
				moneyHas = "200";
			}
		}
		System.out.println(
				"What is your favorite ROYGBIV color? If you do not know what ROYGBIV stands for, please type \"Help\" for a list of the ROYGBIV colors.");
		String faveColor = input.next();
		String transMode = null;
		if (faveColor.equalsIgnoreCase("Help")) {
			System.out.println("ROYGBIV stands for: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
			System.out.println("Please choose a color");
			String helpResponse = input.next();
			faveColor = helpResponse;
		}

		if (faveColor.equalsIgnoreCase("Red")) {
			transMode = "private jet.";
		}
		if (faveColor.equalsIgnoreCase("Orange")) {
			transMode = "roller blades.";
		}
		if (faveColor.equalsIgnoreCase("Yellow")) {
			transMode = "donkey.";
		}
		if (faveColor.equalsIgnoreCase("Green")) {

			transMode = "foot.";
		}
		if (faveColor.equalsIgnoreCase("Blue")) {
			transMode = "tandem bike.";
		}
		if (faveColor.equalsIgnoreCase("Indigo")) {
			transMode = "Shih Tzu drawn carriage.";
		}
		if (faveColor.equalsIgnoreCase("Violet")) {
			transMode = "Uber.";
		}

		System.out.println("Please enter the number of siblings you have");
		int siblingNum = input.nextInt();

		int retireYears = 0; // assign variable
		if (userAge % 2 == 0)
			retireYears = 12;
		else if (userAge % 2 == 1)
			retireYears = 5;

		String vacaHome = null;
		if (siblingNum == 0) {
			vacaHome = "St. Augustine, Florida";
		}

		else if (siblingNum == 1) {
			vacaHome = "Big Sur, California";
		}

		else if (siblingNum == 2) {
			vacaHome = "Tokyo, Japan";
		}

		else if (siblingNum == 3) {
			vacaHome = "Caye Caulker, Belize";
		}

		else if (siblingNum > 3) {
			vacaHome = "Florence, Italy";
		}

		else if (siblingNum < 0) {
			vacaHome = "Vozrozhdeniya Island, Kazakhstan/Uzbekistan";
		}

		System.out.println(fName + " " + lName + " will retire in " + retireYears + " years with " + moneyHas
				+ " in the bank, a vacation home in " + vacaHome + " and travel by " + transMode + " !");
		// =Even number if it's even they will

		// odd number

		// fname + lname "will retire in " + (# of years) + "with" (amount of
		// Money) + "in the bank, a vacation home in" + (Location) and a (Mode
		// of transportation) + "."

	}
}
