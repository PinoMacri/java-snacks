package org.javasnack;
import java.util.Random;

public class JavaSnakeSette {
	public static void main(String[] args) {
		Random r = new Random();
		int valore = -1;

		while (valore % 3 != 0 || valore % 5 != 0) {
		    valore = r.nextInt(101);
		    System.out.println(valore);
		}

		System.out.println("Ultimo valore generato: " + valore);

		; 	
} }
