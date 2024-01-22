package com.jdc.test;

import java.util.Scanner;

public class ReverseProgram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to be reversed : ");
		String a = sc.nextLine();

		String reverse = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			reverse = reverse + a.charAt(i);
		}
		
		System.out.print("Reverse Number of "+ a + " : " + reverse);

	}

}
