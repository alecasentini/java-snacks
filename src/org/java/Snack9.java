package org.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int total= 0;
		
		while (total < 1000) {
			System.out.print("Aggiungi un numero: ");
			int num = sc.nextInt();
			total += num;
			
			System.out.println("La somma totale è: " + total);
		}
		
	}

}
