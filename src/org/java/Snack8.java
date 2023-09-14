package org.java;

import java.util.Random;
import java.util.Scanner;


public class Snack8 {
	public static void main(String[] args) {
		
Random r = new Random();
		
		int min = 100;
		int max = 150;
		int sum = 0;
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		int [] randomNumbers = new int[10];
		
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = r.nextInt(max - min + 1) + min;
			
			System.out.println("Numero " + (i+1) + ": " + randomNumbers[i]);
			
			sum += randomNumbers[i];
			
			if (randomNumbers[i] < minValue) {
				minValue = randomNumbers[i];
			}
			if (randomNumbers[i] > maxValue) {
				maxValue = randomNumbers[i];
			}
		}
		
		double media = (double) sum / randomNumbers.length;
		
		System.out.println("Valore minimo: " + minValue);
		System.out.println("Valore massimo: " + maxValue);
		System.out.println("Media: " + media);
	}
	

}
