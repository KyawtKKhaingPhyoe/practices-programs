package com.jdc.test;

import java.util.Scanner;

public class ReverseVowels {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter a string you want to check : ");
			var str = sc.next();
			
			System.out.print("Final reverse string : "+ reverseVowelsInString(str));
			
		}
		
	}
	
	private static String reverseVowelsInString(String str) {
		char a[] = str.toCharArray();
		
		int start = 0;
		int end = a.length - 1;
		
		while(start<end) {
			if(!isVowel(a[start])) {
				start++;
			} else if (!isVowel(a[end])) {
				end--;
			} else {
				char temp = a[start];
				a[start] = a [end];
				a[end] = temp;
				start++;
				end--;
			}
		}
		return String.valueOf(a);
	}

	private static boolean isVowel(char c) {
		
		if( c == 'a' || c == 'A' || c == 'e' || c == 'E' ||
			c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
			c == 'u' || c == 'U' )
			return true;
		return false;
	}

}
