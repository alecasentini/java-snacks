package org.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Inserisci una parola: ");
		String parola = sc.nextLine().toLowerCase();
		
		String parolaInversa = "";
		
		for (int i = parola.length() - 1 ; i >= 0; i--) {
			
			parolaInversa += parola.charAt(i);
			
		}
		
		System.out.println("La parola inversa è: " + parolaInversa);

        if (parola.equals(parolaInversa)) {
            System.out.println("La parola è palindroma!");
        } else {
            System.out.println("La parola NON è palindroma");
        }
	}

}
