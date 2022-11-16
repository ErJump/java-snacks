package org.generation.italy;

import java.util.Random;

public class Snack8 {
	public static void main(String[] args) {
		
		//Creare un array di 10 elementi interi random compresi tra -50 e +50 (utilizzare l'oggetto random con seed 128 new Random(128))
		Random rnd = new Random(128);
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100) - 50;
			System.out.println(arr[i]);
		}
		
		//trovare il valore assoluto piu' grande e stampare il valore corrispondente
		int absMax = Math.abs(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) > absMax) {
				absMax = Math.abs(arr[i]);
			}
		}
		System.out.println("Valore assoluto massimo: " + absMax);
		
		//trovare il valore assoluto piu' piccolo e stampare il valore corrispondente
		int absMin = Math.abs(arr[0]);
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i]) < absMin) {
				absMin = Math.abs(arr[i]);
			}
		}
		System.out.println("Valore assoluto minimo: " + absMin);
		
		//calcolare la sommatoria dei valori multipli di 5
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("Sommatoria dei multipli di 5: " + sum);
	}
}
