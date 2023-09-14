package org.java;

import java.util.Random;
import java.util.Scanner;

public class Snack10 {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int min = 100;
		int max = 1000;
		
		int [] randomNumbers = new int[10];
		
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = r.nextInt(max - min + 1) + min;
			System.out.println("Numero in posizione " + (i) + ": " + randomNumbers[i]);
		}
		
		System.out.println("Numeri Pari: ");
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] % 2 == 0) {
				System.out.println(randomNumbers[i]);
			}
		}
		
		System.out.println("Numeri Dispari: ");	
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] % 2 != 0) {
				System.out.println(randomNumbers[i]);
			}
		}
		
		System.out.println("Numeri in posizione Pari: ");
		for (int i = 0; i < randomNumbers.length; i += 2) {
			System.out.println(randomNumbers[i]);
		}
		
		System.out.println("Numeri in posizione Dispari: ");
		for (int i = 1; i < randomNumbers.length; i += 2) {
			System.out.println(randomNumbers[i]);
		}
		
	}

}
