package com.jdc.test;

import java.util.Scanner;

public class PetersonNumberChecked {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to be checked : ");
		String n = sc.nextLine();

		int sum = 0;

		for (int i = 0; i < n.length(); i++) {

			int fact = 1;

			int x = Character.getNumericValue(n.charAt(i));

			// factorial
			for (int a = 1; a <= x; a++) {
				fact = fact * a;
			}

			sum = sum + fact;

		}

		if (sum == Integer.parseInt(n)) {

			System.out.println("This " + n + " is a Peterson Number.");

		} else {
			System.out.println("This " + n + " is not a Peterson Number.");
		}

	}

}
