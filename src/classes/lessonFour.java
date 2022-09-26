package bnn.classes;

import java.util.Scanner;

public class lessonFour {

	public static void main(String[] args) {
		/*
		//Ex.1
		double radius = 7;
		System.out.printf("%.4f \n", circumference(radius));
		
		//Ex.2
		String type = "K"; // F or K
		double temp = 36.6;
		double currentTemp = converterTemp(type, temp);
		System.out.printf("%.2f%s \n", currentTemp, type);
		
		//Ex. 3
		Scanner in = new Scanner(System.in);		
		System.out.printf("Enter number: \n");
		int number = in.nextInt();
		in.close();
				
		threeNumber(number);
		*/
		//Ex. 4
		double circleArea = 15;
		double squareArea = 8;
		
		System.out.printf("%b", figureComparison("SinC", circleArea, squareArea));
		

	}
	//Ex. 4
	static boolean figureComparison(String mode, double circleArea, double squareArea) {
		double a = Math.sqrt(squareArea);
		double b = Math.sqrt(2 * squareArea);
		double r = Math.sqrt(circleArea / Math.PI);
		if(mode == "CinS" && a >= 2 * r) 
			return true;
		if(mode == "SinC" && 2 * r >= b) 
			return true;
		return false;			
	}
	
	//Ex. 1
	static double circumference(double circleRadius) {
		return 2 * Math.PI * circleRadius;
	}
	//Ex. 2
	static double converterTemp(String type, double temp) {
		if(type == "F")
			return temp * 1.8 + 32;
		else //type == "K"
			return temp + 273.15;
	}
	//Ex. 3
	static void threeNumber(int number) {
		int units = number % 10;
		System.out.printf("Units: %d \n", units);
		number = number / 10;
		int dozens = number % 10;
		System.out.printf("Dozens: %d \n", dozens);
		number = number / 10;
		int sumOfNumber = number + dozens + units;
		System.out.printf("Sum of number: %d \n", sumOfNumber);
		int productOfNumber = number * dozens * units;
		System.out.printf("product of number: %d \n", productOfNumber);
	}

}
