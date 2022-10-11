package fr.diginamic.banque;

import fr.diginamic.banque.entities.Compte;
import fr.diginamic.banque.entities.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		
		
		Compte cpt1 = new Compte(3,567);
		System.out.println(cpt1);
		
		CompteTaux cpt2 = new CompteTaux(4,678,"compte de jean");		
	
		
		Compte[] tablCompte = {cpt1,cpt2};
		
		for (int i=0; i<=tablCompte.length-1; i++) {
			System.out.println(tablCompte[0]);
			System.out.println(tablCompte[1]);
		}
		
	}

}
