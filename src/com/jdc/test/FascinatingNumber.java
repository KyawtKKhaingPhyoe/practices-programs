package com.jdc.test;

import java.util.Scanner;

public class FascinatingNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be checked : ");
		int num = sc.nextInt();

		int n1 = num * 2;

		int n2 = num * 3;

		String concatNum = num + "" + n1 + n2;

		boolean isFascinating = true;

		for (char c = '1'; c <= '9'; c++) {

			int count = 0;

			for (int i = 0; i < concatNum.length(); i++) {

				char ch = concatNum.charAt(i);

				if (ch == c) {
					count++;
				}
			}

			if (count > 1 || count == 0) {
				isFascinating = false;
				break;
			}

		}

		if (isFascinating) {
			System.out.print(num + " is a Fascinating Number!");
		} else
			System.out.print(num + " is not a Fascinating Number!");

	}

}
