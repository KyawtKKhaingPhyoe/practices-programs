package com.jdc.test;

import java.util.Scanner;

public class TechNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be checked : ");
		int num = sc.nextInt();

		int temp = num;

		int count = 0;
		int square;

		while (temp > 0) {
			count++;
			temp = temp / 10;
		}

		if (count % 2 == 0) {

			temp = num;

			int firstHalf = num % (int) Math.pow(10, count / 2);

			int secondHalf = num / (int) Math.pow(10, count / 2);

			square = (firstHalf + secondHalf) * (firstHalf + secondHalf);

			if (num == square) {
				System.out.print(num + " is a tech number.");
			} else
				System.out.print(num + " is not a tech number.");

		}
	}

}
