package main;

import application.Etudiant;
import application.Personne;
import application.Professeur;

public class Main {

	public static void main(String[] args) {
		// test avec les instances des trois classes à move dans le package application
		new Etudiant().printMe();
		new Personne().printMe();
		new Professeur().printMe();
	}

}