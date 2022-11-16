package org.generation.italy;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {

        String[] names = {"Mario", "Luigi", "Pippo", "Pluto", "Paperino", "Topolino", "Minnie", "Paperina", "Paperoga", "Paperone"};

        String[] surnames = {"Rossi", "Bianchi", "Verdi", "Paperoni", "Neri", "Fedeli", "Rizzo", "Monti", "Rosi", "Gialli"};
        
        Random rnd = new Random();
        
        String[] fullNames = new String[10];
        
        for (int i = 0; i < 10; i++) {
        	int rndNameIndex = rnd.nextInt(names.length);
        	int rndSurnameIndex = rnd.nextInt(surnames.length);
            String fullName = names[rndNameIndex] + " " + surnames[rndSurnameIndex];
            fullNames[i] = fullName;
        }
        
        for (int i = 0; i < fullNames.length; i++) {
        	System.out.println(fullNames[i]);
        }
	}
}
