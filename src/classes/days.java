package bnn.classes;

public class days {

	public static void main(String[] args) {
		// Auto-generated method stub
		
		int allDays = 234;
		
		int weeks = allDays / 7;
		System.out.printf("Weeks: %d \n", weeks);
		
		int months = allDays / 30;
		System.out.printf("Months: %d \n", months);
		
		
		int number = 39;
		
		int dozens = number / 10;
		System.out.printf("Dozens: %d \n", dozens);
		
		int units = number % 10;
		System.out.printf("Units: %d \n", units);
		
		int sumOfNumbers = dozens + units;
		System.out.printf("Sum of numbers: %d \n", sumOfNumbers);
		
		int productOfNumbers = dozens * units;
		System.out.printf("Product of numbers: %d \n", productOfNumbers);

	}

}
