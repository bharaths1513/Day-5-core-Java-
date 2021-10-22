package Day5_Core_Java_And_Functional_Java;

import java.util.Scanner;

public class windchill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit between -58�F and 41�F: ");
		double temp = sc.nextInt();
		System.out.println("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = sc.nextInt();
		sc.close();
		windchill(temp, speed);
	}

	static void windchill(double t, double s) {

		double w = 35.74 + 0.6215 * t + 0.4275 * t * Math.pow(s, 0.16) - 35.75 * Math.pow(s, 0.16);
		System.out.println("Thw wind chill index is : " + w);

	}
}
