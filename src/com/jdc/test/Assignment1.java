package com.jdc.test;

class Assignment1{

	public static void main(String[] args) {
		
		//initialize array
		int []array = new int[]{2, -21, 3,3, 45, 0, 12, 45, 0, 12, 18, 6, 3, 1, 0,-221};

		//initialize minimum
		int min = array[0];

		//loop through the array
		for(int i = 0; i< array.length; i++){
			if(array[i]<min)
				min = array[i];
		}

		System.out.println("Minimum number of array of ints :: " + min);

	}

}