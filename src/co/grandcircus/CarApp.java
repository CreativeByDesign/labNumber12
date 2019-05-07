package co.grandcircus;
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Car car = new Car();
		
		System.out.println("How many cars will you like to enter?");
		int carNum = scan.nextInt();
		scan.nextLine();
		ArrayList<Car> newCars = new ArrayList<>();
		
		for (int i = 0; i < carNum; i++) {
			System.out.println("Please enter a car make: ");
			String make =scan.nextLine();
			System.out.println("Please enter a car model: ");
			String model = scan.nextLine();
			System.out.println("Please enter the car year: ");
			int year = scan.nextInt();
			System.out.println("Please enter the car price: ");
			Double price = scan.nextDouble();
			scan.nextLine();
			newCars.add(new Car(make, model, year,price));	
			}
		System.out.println(newCars);
	
	}

}
