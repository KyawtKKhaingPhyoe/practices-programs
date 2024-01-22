package com.jdc.test;

public class GenerateRandom {
	
	public static void main(String[] args) {
		
		int min = 000000;
		int max = 999999;
		
		// generate random integer value from min to max
		System.out.print("Random value (integer) : ");
		int a = (int) (Math.random()*(max-min+1)+min);
		System.out.println(a);
		
		// generate random double value from min to max
		System.out.print("Random value (double) : ");
		double b = (Math.random()*(max-min+1)+min);
		System.out.print(b);
		
	}

}
