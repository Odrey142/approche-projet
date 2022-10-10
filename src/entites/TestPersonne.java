package entites;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adresse3 = new AdressePostale();
		adresse3.codePostal = 97200;
		adresse3.numeroDeRue = 5;
		adresse3.libelleDeRue = "Fort de france";
		adresse3.ville = "Martinique";
			
		Personne per1 = new Personne();
			per1.nom = "Gilbert";
			per1.prenom = "Don";
			per1.adressePostale = adresse3;
			

	AdressePostale adresse4 = new AdressePostale();
			adresse4.codePostal = 97200;
			adresse4.numeroDeRue = 5;
			adresse4.libelleDeRue = "Konoha";
			adresse4.ville = "Pays du feu";			
		Personne per2 = new Personne();
			per2.nom =" Uzumaki";
			per2.prenom = "Naruto";
			per2.adressePostale = adresse4;
			

			
			
			
	}

}
