package carLotEntry;


import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String carMake;
		String carModel;
		int carYear;
		double carPrice;
		int enteredCars;
		
		System.out.println("This is the Grand Circus Motors admin console.");
		
		System.out.println("How many cars are you adding to inventory today? ");
		enteredCars = key.nextInt();
		Car[] carEntry = new Car[enteredCars];
		
		for (int i = 0; i < carEntry.length; i++) {
			carMake = Validator.getRegex(key, "[A-Z\\sa-z]{1,30}", "Enter in the make of car #" + (i+1) + ": ");
			carModel = Validator.getRegex(key, "[A-Z\\sa-z]{1,30}", "Enter in the model of car #" + (i+1) + ": ");
			carYear = Validator.getInt(key, "Enter in the year of car #" + (i+1) + ": ");
			carPrice = Validator.getDouble(key, "Enter in the price of car #" + (i+1) + ": ");
		carEntry[i] = new Car(carMake, carModel, carYear, carPrice);
		
		}
		
		System.out.println("Here's what's been added to inventory:\n");
		
		for (Car car : carEntry) {
			System.out.println(car);
		}

	}

}
