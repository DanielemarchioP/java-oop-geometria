package org.lessons.java.geometria;

public class Rettangolo {

	int base;
	int altezza;
	
	public void calcoloPerimetro() {
		int perimetro = (base + base + altezza + altezza);
		System.out.println("il perimetro del rettangolo equivale a : " + perimetro);
	}
	
	public void calcoloArea() {
		int area = base*altezza;
		System.out.println("L'area del rettangolo equivale a : " + area);
	}
}
