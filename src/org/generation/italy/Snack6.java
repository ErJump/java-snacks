package org.generation.italy;

public class Snack6 {
	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		//calcolare un array sommatoria dove ogni elemento corrisponde alla somma degli elementi dei due array alla stessa posizione
		int[] arrSum = new int[arr1.length];
		
		for (int i = 0; i < arrSum.length; i++) {
			arrSum[i] = arr1[i] + arr2[i];
			System.out.println(arrSum[i]);
		}
		
		//trovare il valore minimo e massimo all'interno di entrambi gli array
		int min1 = arr1[0];
		int max1 = arr1[0];
		int min2 = arr2[0];
		int max2 = arr2[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] < min1) {
				min1 = arr1[i];
			}
			if (arr1[i] > max1) {
				max1 = arr1[i];
			}
			if (arr2[i] < min2) {
				min2 = arr2[i];
			}
			if (arr2[i] > max2) {
				max2 = arr2[i];
			}
		}

		System.out.println("min1 - max1: " + min1 + " - " + max1);
		System.out.println("min2 - max2: " + min2 + " - " + max2);

		//calcolare la sommatoria e la media di entrambi gli array
		int sum = 0; 
		for (int i = 0; i < arrSum.length; i++) {
			sum += arrSum[i];
		}
		System.out.println("sum: " + sum);

		int avg = sum / (arr1.length + arr2.length);

		System.out.println("avg: " + avg);
	}
}
