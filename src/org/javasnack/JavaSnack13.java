package org.javasnack;

import java.util.Arrays;

public class JavaSnack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
		Integer[] arr4 = Arrays.copyOf(arr2, arr2.length);
		if (arr3[0]==1) {
			arr3[0]=34;
		}
		if (arr4[0]==34) {
			arr4[0]=1;
		}
		System.out.println(Arrays.asList(arr3));
		System.out.println(Arrays.asList(arr4));
    }
}
