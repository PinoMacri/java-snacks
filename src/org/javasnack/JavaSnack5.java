package org.javasnack;
import java.util.Arrays;
import java.util.Random;

public class JavaSnack5 {
	public static void main(String[] args) {
	
		int somma = 0;
		int sommaPari = 0;
		int sommaDispari = 0;
		int media = 0;
		int[] numeriDispari = new int[0];
		int mediaDispari = 0;
		for (int i = 0; i < 5; i++) {
			Random r = new Random();
			int result = r.nextInt(0,100);
			if(result % 2 == 0) {
				sommaPari += result;
				System.out.println("Il numero casuale è " + result + ", Paro");
			} else if ( result % 2 != 0 ) { 
				sommaDispari += result;
				System.out.println("Il numero casuale è " + result + ", Disparo"); 
				  numeriDispari = Arrays.copyOf(numeriDispari, numeriDispari.length + 1);
			      numeriDispari[numeriDispari.length - 1] = result;
			}
			somma += result; 
		}
		
		
		media += somma / 5;
		mediaDispari += sommaDispari / numeriDispari.length;
		System.out.println("La somma dei numeri casuali è " + somma);
		System.out.println("La somma dei numeri PARI è " + sommaPari);
		System.out.println("Il numero di numeri dispari è " + numeriDispari.length);
		System.out.println("La media dei numeri è " + media);
		System.out.println("La media dei numeri DISPARI è " + mediaDispari);
	}
}
