package org.java;

import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Scrivi un numero: ");
		String numero = sc.nextLine();
	
		int numeroConvertito = 0;
	
		for (int i = 0; i < numero.length(); i++) {
			char c = numero.charAt(i);
			
			int cifra = c - '0';
			
			numeroConvertito = numeroConvertito * 10 + cifra;
			
			}
		
		System.out.println("Numero convertito: " + numeroConvertito);
		
		}	
		
}
