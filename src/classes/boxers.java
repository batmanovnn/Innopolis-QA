package bnn.classes;

import static java.lang.System.*;
import java.util.Scanner;

public class boxers {

	public static void main(String[] args) {
		// Skelet app
		
		out.print("Enter boxer's weight: ");
		Scanner in = new Scanner(System.in);
		
		int weight = in.nextInt();
		
		String type = boxerType(weight);
		
		out.printf("%s is %s.", weight, type);
	
	}
	
	static String boxerType(int weight) {
		
		if(weight < 75) {
			if(weight < 65)
				return "Light";
			else return "Medium";
		}
		else {
			if(weight < 91)
				return "Heavyweight";
			else return "Super heavyweight";
		}
	}

}


