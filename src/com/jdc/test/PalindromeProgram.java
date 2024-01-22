package com.jdc.test;

import java.util.Scanner;

class PalindromeProgram {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter number or string to be checked : ");
			String n = sc.nextLine();
			
			while(!n.equalsIgnoreCase("y")) {
				
				String reverse = "";

				for (int i = n.length() - 1; i >= 0; i--) {
					reverse = reverse + n.charAt(i);
				}

				if (n.equals(reverse)) {
					System.out.println(n + " is a palindrome!");
				} else
					System.out.println(n + " is not a palindrome!");
				System.out.println("Enter string to be checked OR Type 'Y' to exit :");
				
				n = sc.nextLine();
				
			}
			
			
			
			
		}

	}

}
