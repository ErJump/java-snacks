package org.generation.italy;

public class Snack7 {
	public static void main(String[] args) {
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine
		String concat = "";
		for (int i = 0; i < words.length; i++) {
			concat += words[i] + " ";
		}
		System.out.println(concat);
		
		//creare e stampare una stringa che sia la concatenazione di tutti gli elementi dell'array in ordine inverso
		String concatReverse = "";
		for (int i = words.length - 1; i >= 0; i--) {
			concatReverse += words[i] + " ";
		}
		System.out.println(concatReverse);
		
		//trovare e stampare la parola piu' lunga e la sua lunghezza
		String longest = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longest.length()) {
				longest = words[i];
			}
		}
		System.out.println("longest: " + longest + " - length: " + longest.length());
	
		//trovare e stampare la parola piu' corta e la sua lunghezza
		String shortest = words[0];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() < shortest.length()) {
				shortest = words[i];
			}
		}
		System.out.println("shortest: " + shortest + " - length: " + shortest.length());
	}
}
