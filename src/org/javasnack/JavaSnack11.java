package org.javasnack;
import java.util.Scanner;
public class JavaSnack11 {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Inserisci un numero intero: ");
	        int numero = input.nextInt();
	        
	        System.out.print("I divisori di " + numero + " sono: ");
	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    } }
