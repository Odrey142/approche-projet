package fr.diginamic.essaie;

import fr.diginamic.banque.entities.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cercle cercle1 = new Cercle(4.8);
		Cercle cercle2 = new Cercle(2.7);
		
		System.out.println(cercle1);
		System.out.println(cercle2);
		
		Cercle cercle3 = CercleFactory.getCercle(3.7); // appel d'une méthode static dans une classe Factory
		System.out.println(cercle3);

	}

}
