package entities2;

import entites.AdressePostale;

public class Personne {

	public String nom;
	public String prenom;
	public AdressePostale adressePostale;
	
	
	public Personne(){
		nom= "Gilbert";
		prenom= "Gibs";
	}
	
	public Personne(String nom,String prenom,AdressePostale adressePostale){
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;

	public String majuscule (String nom, String prenom) {
		System.out.println(nom.toUpperCase() prenom.toUpperCase());
	}
		
	
	}
	
}
