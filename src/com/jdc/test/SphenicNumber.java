package com.jdc.test;

import java.util.ArrayList;
import java.util.Scanner;

public class SphenicNumber {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be checked : ");
		int num = sc.nextInt();

		if (isSphenic(num)) {

			System.out.println(num + " is a Sphenic number!");

		} else
			System.out.println(num + " is a Sphenic number!");

	}

	private static boolean isSphenic(int num) {

		ArrayList<Integer> factorArray = new ArrayList<Integer>();

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				factorArray.add(i);

			}

		}

		ArrayList<Integer> primeArray = new ArrayList<Integer>();

		int product = 1;

		for (int i = 0; i < factorArray.size(); i++) {

			if (isPrime(factorArray.get(i))) {

				primeArray.add(factorArray.get(i));

			}

		}
		System.out.println("PrimeArray : "+ primeArray);

//		System.out.println("Product : " + product);
//
//		if (product == num) {
//			return true;
//		} else
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
