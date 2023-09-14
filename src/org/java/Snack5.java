package org.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String scritta = "";
		
		while (!scritta.equals("0")) {
		
			System.out.print("Scrivi qualcosa: ");
			scritta = sc.nextLine();
			
			int lettere = 0;
			int numeri = 0;
			int simboli= 0;
			
			for (int i = 0; i< scritta.length(); i++) {
				char c = scritta.charAt(i);
				if (Character.isLetter(c)) {
					lettere++;
				} else if (Character.isDigit(c)) {
					numeri++;
				} else {
					simboli++;
				}
			}
			
			System.out.println("La stringa contiene " + lettere + " lettere, " + numeri + " numeri e " + simboli + " simboli.");
		}
	}
}
