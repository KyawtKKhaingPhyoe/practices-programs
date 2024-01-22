package com.jdc.test;

import java.util.Scanner;

public class ATMProgram {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int balance = 1000000;
		int withdraw, deposit;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Welcome to ATM");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.print("Choose the operation you want to perform ::: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter amount to be withdraw : ");
				withdraw = sc.nextInt();

				if (balance >= withdraw) {

					balance = balance - withdraw;
					System.out.println("Please collect your money....");

				} else
					System.out.println("Sorry...Insufficient Balance!");
				System.out.println("");
				break;
			
			case 2:
				System.out.print("Enter amount to be deposited : ");
				
				deposit = sc.nextInt();
				
				balance += deposit;
				
				System.out.println("Deposited Successfully!");
				System.out.println("");
				break;
			
			case 3:
				System.out.print("Balance : "+ balance);
				System.out.println("");
				break;
				
			case 4:
				System.out.println("Thank you!!!");
				System.out.println("Have a Good Day... Dear Customer!");
				System.exit(0);
				
			}

		}

	}

}
