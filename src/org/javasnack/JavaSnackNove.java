package org.javasnack;
import java.util.Scanner;
public class JavaSnackNove {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Base");
	int base = in.nextInt();
	System.out.println("Altezza");
	int altezza = in.nextInt();
	int area = base * altezza;
	int perimetro = (base + base) + (altezza + altezza);
	System.out.println("l'area è di " + area);
	System.out.println("Il perimetro è di " + perimetro);
} }
