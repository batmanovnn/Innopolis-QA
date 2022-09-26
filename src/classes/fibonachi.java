package bnn.classes;

import java.util.Arrays;
import java.util.Scanner;

public class fibonachi {

	public static void main(String[] args) {
		// Fibonachi
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		fibonachi(arr);
		String arrString = Arrays.toString(arr);
		System.out.println(arrString);

	}
	
	static void fibonachi(int arr[]) {
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
	}
	
	

}
