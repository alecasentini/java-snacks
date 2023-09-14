package org.java;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Inserisci un numero di secondi: ");
		int sec= sc.nextInt();
		
		int ore = sec / 3600;
		int minuti = (sec % 3600) / 60;
		int secondi = sec % 60;
		
		System.out.printf("Calcolo ora: %02d:%02d:%02d", ore, minuti, secondi);
			
	
	}
}
