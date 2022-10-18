package fr.diginamic.utils;

import fr.diginamic.banque.entities.Cercle;

public class CercleFactory {

	public static Cercle getCercle(double rayon) {
		Cercle cercle = new Cercle(rayon);
		return cercle;
	}
	
	
	
}
