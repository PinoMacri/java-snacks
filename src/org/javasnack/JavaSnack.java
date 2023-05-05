package org.javasnack;

import java.util.Scanner;

public class JavaSnack {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Digita un numero");
		int userStr = in.nextInt();
		if (userStr % 2 == 0) {
			System.out.println(userStr);
		} else {
			System.out.println(userStr + 1);
		}
		in.close();
	}
}
