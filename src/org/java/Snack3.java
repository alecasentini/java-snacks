package org.java;

public class Snack3 {
	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		
		for (int i = 0; i<num.length; i++) {
			if (i%2 != 0) {
				sum += num[i];
			}
		}
		
		System.out.println("La somma degli elementi nelle posizioni dispari è: " + sum);}
	}


