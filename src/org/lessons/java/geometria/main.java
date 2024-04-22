package org.lessons.java.geometria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Rettangolo rettangolo1 = new Rettangolo();
		
		Scanner valore = new Scanner(System.in);
		
		System.out.println("inserisci il valore dell'altezza");
		rettangolo1.altezza= valore.nextInt();
		System.out.println("inserisci il valore della base");
		rettangolo1.base = valore.nextInt();
		
		rettangolo1.calcoloPerimetro();
		rettangolo1.calcoloArea();
	}

}
