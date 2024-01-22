package com.jdc.test;

import java.util.Scanner;

public class AutomorphicNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be checked : ");
		int n = sc.nextInt();
		int count = 0;

		int square = n * n;
		
		int temp = n;
		
		while(temp > 0) {
			count++;
			temp = temp/10;
		}
		
		int lastDigit = (int) (square % (Math.pow(10, count)));
		
		if(n == lastDigit) {
			System.out.print(n + " is an automorphic number.");
		}else {
			System.out.print(n + " is not an automorphic number.");
		}

	}

}
