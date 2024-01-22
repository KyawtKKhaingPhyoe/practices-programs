package com.jdc.test;

import java.util.Scanner;


class PrimeProgram {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a number to be checked : ");
			var c = sc.nextInt();

			if (isPrime(c)) {
				System.out.println(c + " is a prime number!");
			} else {
				System.out.println(c + " is not prime number!");
			}

		}

	}

	private static boolean isPrime(int c) {

		if (c <= 1) {
			return false;
		}

		for (int i = 2; i <= 9; i++) {

			if (c % i == 0)
				return false;

		}

		return true;
	}

}
