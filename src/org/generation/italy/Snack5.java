package org.generation.italy;

public class Snack5 {
	public static void main(String[] args) {
		//dato l'array
		int[] arr = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		
		//trovare il valore minimo e massimo dell'array
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] < min) {
        		min = arr[i];
        	}
        	if (arr[i] > max) {
        		max = arr[i];
        	}
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
		
        //calcolare sommatoria e media
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        }
        double avg = (double)sum / arr.length;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
	}
}
