package entites;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Personne per1 = new Personne();
			per1.nom = "Gilbert";
			per1.prenom = "Don";
			per1.adressePostale = new AdressePostale();
			per1.adressePostale.codePostal = 97200;
			per1.adressePostale.numeroDeRue = 5;
			per1.adressePostale.libelleDeRue = "Fort de france";
			per1.adressePostale.ville = "Martinique";
			

	AdressePostale adresse4 = new AdressePostale();
					
		Personne per2 = new Personne();
			per2.nom =" Uzumaki";
			per2.prenom = "Naruto";
			per2.adressePostale = new AdressePostale();
			per2.adressePostale.codePostal = 97200;
			per2.adressePostale.numeroDeRue = 5;
			per2.adressePostale.libelleDeRue = "Konoha";
			per2.adressePostale.ville = "Pays du feu";	
			
			
	}

	//Il y a beaucoup de ligne à coder 
	
}
