package com.jdc.test;

import java.util.Scanner;

public class KeithNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be checked : ");
		int n = sc.nextInt();

		int temp = n;

		String s = Integer.toString(n);

		int array[] = new int[n];

		int i, sum = 0;

		for (i = s.length() - 1; i >= 0; i--) {
			array[i] = temp % 10;
			temp = temp / 10;
		}

		i = s.length();
		while (sum < n) {

			sum = 0;
			for (int j = 1; j <= s.length(); j++) {
				sum = sum + array[i - j];
			}
			array[i] = sum;
			i++;

		}

		if (sum == n) {
			System.out.println(n + " is a Keith Number!");
		} else
			System.out.println(n + " is not a Keith Number!");

	}

}
