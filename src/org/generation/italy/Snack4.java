package org.generation.italy;

import java.util.Random;

public class Snack4 {
	public static void main(String[] args) {
		int[] arr1 = new int[4];
		int[] arr2 = new int [10];
		
		Random rnd = new Random();
		
		int delta = arr2.length - arr1.length;
		
		for (int i = 0; i < delta; i++) {
			System.out.println(rnd.nextInt());
		}
	}
}
