package com.jdc.test;

import java.util.Scanner;

public class GreatestCommonDivisorOfStrings {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Enter 1st string : ");
			var str1 = sc.next();
			
			System.out.print("Enter 2nd string : ");
			var str2 = sc.next();
			
			if(!(str1+str2).equals(str2+str1)) {
				System.out.println("No gcd");
			} else {
				int gcd = gcd(str1.length(), str2.length());
				System.out.println("GCD is : "+ str2.substring(0, gcd));
			}
			
			
		}
		
		
	}

	private static int gcd(int a, int b) {
		
		return (b == 0)? a : gcd(b, a%b);
		
	}

}
