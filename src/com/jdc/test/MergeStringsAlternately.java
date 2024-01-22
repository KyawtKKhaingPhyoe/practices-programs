package com.jdc.test;

import java.util.Scanner;

public class MergeStringsAlternately {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter 1st string : ");
			var word1 = sc.next();

			System.out.print("Enter 2nd string : ");
			var word2 = sc.next();
			
			StringBuilder result = new StringBuilder();
			
			int i = 0;
			
			while(i < word1.length() || i < word2.length()) {
				
				if(i < word1.length()) {
					result.append(word1.charAt(i));
				}
				if(i < word2.length()) {
					result.append(word2.charAt(i));
				}
				
				i++;
				
			}
			
			result.toString();
			
			System.out.print("The final merged string : "+ result);
		}

		
	}

}
