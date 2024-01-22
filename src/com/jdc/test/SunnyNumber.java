package com.jdc.test;

import java.util.Scanner;

public class SunnyNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be checked : ");
		int num = sc.nextInt();

		if (isSunnyNumber(num)) {
			System.out.print("This number => " + num + " is Sunny number!");
		} else
			System.out.print("This number => " + num + " is not Sunny number!");

	}

	private static boolean isSunnyNumber(int num) {

		if (Math.sqrt(num + 1) % 1 == 0) {
			return true;
		} else
			return false;
	}

}
