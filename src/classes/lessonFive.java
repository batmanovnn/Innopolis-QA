package bnn.classes;

import static java.lang.System.*;
import java.util.Scanner;

public class lessonFive {

	public static void main(String[] args) {
		
		// Ex. 5
		int n;				
		Scanner in = new Scanner(System.in);
		
		out.printf("Enter total numbers of array: ");
		n = in.nextInt();
		double[] arr = new double[n];
		
		//Entering array:
		out.printf("\nEnter arr of float numbers: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = in.nextDouble();
		}
		
		out.printf("Average number: %.4f", averageArr(arr));
				
			

	}
	
	//Ex.5
	static double averageArr(double[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum / arr.length;
	}

}
