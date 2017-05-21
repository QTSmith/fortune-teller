import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String fName = input.nextLine();
		System.out.println("What is your last name?");
		String lName = input.nextLine();

		System.out.println("What is your age?");
		int userAge = input.nextInt();

		// If the user’s age is an odd number, then the user will retire in ____
		// years if the user's age is odd, or ___ years if user's age is even.
		int retireYears; // assign variable
		if (userAge % 2 == 0)
			retireYears = 12;
		else if (userAge % 2 == 1)
			retireYears = 5;

		System.out.println("Please enter your birth month using 1-12.");
		int birthMonth = input.nextInt();
		double moneyHas;
		switch (birthMonth) {
		case 1 :
		}

		System.out.println(
				"What is your favorite ROYGBIV color? If you do not know what ROYGBIV stands for, please type \"Help\" for a list of the ROYGBIV colors.");
		String faveColor = input.nextLine();
		String transMode;
		if (faveColor.equalsIgnoreCase("Help")) {
			System.out.println("ROYGBIV stands for: Red, Orange, Yellow, Green, Blue, Indigo, and Violet.");
			System.out.println("Please choose a color");
			String helpResponse = input.nextLine();
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

		String vacaHome;
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

		// =Even number if it's even they will

		// odd number

		// fname + lname "will retire in " + (# of years) + "with" (amount of
		// Money) + "in the bank, a vacation home in" + (Location) and a (Mode
		// of transportation) + "."

	}
}
