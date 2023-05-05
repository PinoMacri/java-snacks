package org.javasnack;

public class JavaSnack4 {
	public static void main(String[] args) {
		String parola = "anna";
		String parolaInvertita = "";

		for(int i = parola.length() - 1; i >= 0; i--) {
			parolaInvertita += parola.charAt(i);
		}

		if(parola.equals(parolaInvertita)) {
			System.out.println("La parola è palindroma");
		} else {
			System.out.println("La parola non è palindroma");
		} }
}
