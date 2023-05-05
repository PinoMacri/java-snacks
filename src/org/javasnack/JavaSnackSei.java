package org.javasnack;
import java.util.Random;
import java.util.Scanner;

public class JavaSnackSei {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digita un numero");
		int numeroLimite = in.nextInt();
		in.close();
		int somma = 0;
		while (somma < numeroLimite) {
			Random r = new Random();
			int result = r.nextInt(0,100);
			System.out.println(result);
			somma += result; 
		} System.out.println(somma);
		
} }

