package org.javasnack;
import java.util.Scanner;
public class JavaSnackDieci {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Raggio");
	int raggio = in.nextInt();
	int area = (int) (raggio * raggio * 3.14);
	int circonferenza = (int) (raggio * 3.14 * 2);
	System.out.println("L'area è di " + area);
	System.out.println("La circonferenza è di " + circonferenza);
} }
