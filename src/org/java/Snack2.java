package org.java;

import java.util.Scanner;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String [] nomi = {
			"Marco", "Paolo", "Maria", "Federico", "Roberta"
		};
		
		String [] cognomi = {
				"Rossi", "Verdi", "Russo", "Franchi", "Ferrari"
			};
		
		Random rand = new Random();
		
		for (int i= 0; i<nomi.length; i++) {
			int randomNomi = rand.nextInt(nomi.length);
			int randomCognomi = rand.nextInt(cognomi.length);
			
			System.out.println(nomi[randomNomi] + " " + cognomi[randomCognomi]);
		}		
		
	}
		
}


