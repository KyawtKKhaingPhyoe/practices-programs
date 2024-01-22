package com.jdc.test;

import java.util.Scanner;

public class SpyNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to be checked : ");
		int num = sc.nextInt();

		String temp = Integer.toString(num);
		int sum = 0;
		int product = 1;

		for (int i = 0; i < temp.length(); i++) {

			sum += Character.getNumericValue(temp.charAt(i));

			product *= Character.getNumericValue(temp.charAt(i));

		}

		if (sum == product) {
			System.out.println(num + " is a Spy number!");
		} else
			System.out.println(num + " is not a Spy number!");

	}

}
