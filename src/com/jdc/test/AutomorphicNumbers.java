package com.jdc.test;

import java.util.Scanner;

public class AutomorphicNumbers {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter starting value : ");
		int start = sc.nextInt();
		
		System.out.print("Enter ending value : ");
		int end = sc.nextInt();
		
		System.out.print("Automorphic numbers between " + start + " and "+ end +" are : ");
		
		for(int i = start; i<= end ; i++) {
			
			if(isAutomorphic(i)) {
				System.out.print(i + " ");
			}
			
		}
		
	}

	private static boolean isAutomorphic(int i) {
		
		int count = 0;
		
		int square = i * i;
		
		int temp = i;
		
		while(temp > 0) {
			count ++;
			temp = temp/10;
		}
		
		int lastDigit = (int) (square % (Math.pow(10, count)));
		
		if( i == lastDigit) {
			return true;
		} else return false;
	}
	
	

}
