package org.javasnack;

import java.util.Arrays;
import java.util.Random;

public class JavaSnackOtto {
	public static void main(String[] args) {
		int[] numeriDispari = new int[0];
		int[] numeriPari = new int[0];

		for(int i = 0; i < 10; i++) {
		    Random r = new Random();
		    int valore = r.nextInt(0,100);
		    System.out.println(valore);
		    if(valore % 2 != 0) {
		        numeriDispari = Arrays.copyOf(numeriDispari, numeriDispari.length + 1);
		        numeriDispari[numeriDispari.length - 1] = valore;
		    } else {
		        numeriPari = Arrays.copyOf(numeriPari, numeriPari.length + 1);
		        numeriPari[numeriPari.length - 1] = valore;
		    }
		}

		System.out.println("Numeri dispari: " + Arrays.toString(numeriDispari));
		System.out.println("Numeri pari: " + Arrays.toString(numeriPari));
	}
}
