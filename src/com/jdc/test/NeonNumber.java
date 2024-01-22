package com.jdc.test;

import java.util.Scanner;

public class NeonNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to be checked : ");
		int n = sc.nextInt();

		int square = n * n;

		String temp = Integer.toString(square);

		int sum = 0;
		for (int i = 0; i < temp.length(); i++) {

			sum += Character.getNumericValue(temp.charAt(i));
			
		}

		if (sum == n) {
			System.out.println(n + " is a Neon Number!");
		} else
			System.out.println(n + " is not a Neon Number!");
	}

}
