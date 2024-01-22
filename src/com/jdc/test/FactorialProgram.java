package com.jdc.test;

import java.util.Scanner;

class FactorialProgram {

	public static void main(String[] args) {
		
		int fact = 1;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number to calculate factorial: ");
			int n = sc.nextInt();
			
			for(int i = 1; i<= n; i++) {
				fact = fact*i;
			}
			System.out.println("Factorial of "+ n + " is " + fact);
		}

	}

}
