package com.jdc.test;

import java.util.Scanner;

public class EmirpNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be checked : ");
		int num = sc.nextInt();

		if (isEmirp(num)) {

			System.out.println(num + " is a Emirp number!");

		} else
			System.out.println(num + " is not a Emirp number!");

	}

	private static boolean isEmirp(int num) {

		String temp = Integer.toString(num);
		String reverse = "";

		if (isPrime(num)) {

			for (int i = temp.length() - 1; i >= 0; i--) {

				reverse = reverse + temp.charAt(i);

			}
			if (isPrime(Integer.parseInt(reverse)))
				return true;
			else
				return false;

		} else
			return false;

	}

	private static boolean isPrime(int num) {

		if (num <= 1)
			return false;

		for (int i = 2; i <= 9; i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

}
