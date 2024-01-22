package com.jdc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AutobiographicalNumber {

	
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number to be checked : ");
			int num = sc.nextInt();

			String temp = Integer.toString(num);

			int sum = 0;

			for (int i = 0; i < temp.length(); i++) {
				sum += Character.getNumericValue(temp.charAt(i));
			}

			if (sum == temp.length()) {
				System.out.println(num + " is a Autobiographical number!");
			} else if (sum != temp.length() || sum > 10) {
				System.out.println(num + " is not a Autobiographical number!");
			}
		}catch(InputMismatchException e) {
			System.out.println(e);
		}
	}

}
