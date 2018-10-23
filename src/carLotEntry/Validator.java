package carLotEntry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				if (i < 2020 && i > 1908) {
				isValid = true;
				} else { System.out.println("There are no cars of that year currently in production. Please enter in a valid year.");
				
				}
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				if (d >= 0 && d != -0) {
				isValid = true;
				} else {
					System.out.println("Number must be a positive value. Enter a positive number value.");
				}
			} else {
				System.out.println("Error! Invalid decimal value for circle. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}

	public static String getRegex(Scanner sc, String regexPattern, String prompt) {
		String input = "";
		boolean isValid = false;
		while (isValid == false) {
			input = getString(sc, prompt);

			if (!input.matches(regexPattern)) {
				System.out.println(
						"You have entered an invalid value. Please enter in the correct value.");
			} else {
				isValid = true;
			}

		}
		return input;

	}
}