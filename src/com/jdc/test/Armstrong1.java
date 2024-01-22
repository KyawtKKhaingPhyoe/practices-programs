package com.jdc.test;

import java.util.Scanner;

class Armstrong1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter the limit : ");
			int num = sc.nextInt();
			
			System.out.println("Armstrong numbers up to "+ num +" are : ");

			for (int i = 0; i <= num; i++) {
				
				if (isArmstrong(i)) {
					System.out.print(i + ", ");
				}
			}
		}

	}

	private static boolean isArmstrong(int n) {

		int temp, digits = 0, last = 0, sum = 0;

		// assign n into temporary variable
		temp = n;

		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;

		while (temp > 0) {

			// determine the last digit from number
			last = temp % 10;

			// calculate power of number up to digit times and add result to sum
			sum += (Math.pow(last, digits));

			// remove last digit
			temp = temp / 10;

		}
		// compare sum with n
		if (n == sum) {
			return true;
		} else
			return false;

	}

}
