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
		this.adressePostale = adressePostale;}

public void afficherIdentite() {
	System.out.println(prenom+""+nom.toUpperCase());
	}

public void setNom(String nvNom) {
	this.nom = nvNom;
	}
	
public void setPrenom(String nvPrenom) {
	this.prenom = nvPrenom;
	}

public void setAdresse (AdressePostale nvAdresse) {
	this.adressePostale = nvAdresse;
}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdresse() {
		return this.adressePostale;
	
}
	}
	

