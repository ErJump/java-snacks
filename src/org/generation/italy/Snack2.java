package org.generation.italy;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {

        String[] names = {"Mario", "Luigi", "Pippo", "Pluto", "Paperino", "Topolino", "Minnie", "Paperina", "Paperoga", "Paperone"};

        String[] surnames = {"Rossi", "Bianchi", "Verdi", "Paperoni", "Neri", "Fedeli", "Rizzo", "Monti", "Rosi", "Gialli"};
        
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
        	int rndNameIndex = rnd.nextInt(names.length);
        	int rndSurnameIndex = rnd.nextInt(surnames.length);
            System.out.println(names[rndNameIndex] + " " + surnames[rndSurnameIndex]);
        }
	}
}
