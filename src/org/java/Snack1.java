package org.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Inserisci un numero: ");
		
		int val= sc.nextInt();
		
		if ((val % 2) == 0) {
			System.out.println("Numero: " + val);
		} else {
			System.out.println("Numero successivo: " + (val + 1));
		}
			
	}
}
