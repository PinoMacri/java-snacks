package org.javasnack;


public class JavaSnackTre {
	public static void main(String[] args) {
 int [] numeri = {2,7,9,4,1,0,3,6,8,9};
int somma = 0;
for(int i = 0; i < numeri.length; i++) {
	if(i % 2 != 0) {
		somma += numeri[i];
	} 
} System.out.println(somma);
}}

