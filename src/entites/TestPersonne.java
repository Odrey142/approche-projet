package entites;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adr1 = new AdressePostale(98,"cijd",33,"djhoi");
			
		Personne per1 = new Personne();
			
		Personne per2 = new Personne ("Gilbert","Don", new AdressePostale(97200,"fortdefrance",3,"martinique"));
		System.out.println(per2.nom);
		
		
		// Je modifie toute les infos de la personne 1
		per1.setNom("Léa");
		per1.setPrenom("marne");
		per1.setAdresse(adr1);
		
		//je modifie la peronne 2
		per2.setNom("Doris");
		System.out.println(per2.nom);
		
		// Je récupère le nom de la personne 1
		per1.getNom(); // ou je peux directement affecter a String nom = per1.getNom(); pour recupérer le nom de la pers1
		System.out.println(per1.nom);
		System.out.println(per1.prenom);
		System.out.println(per1.adressePostale);
		
		
		//je récupère l'adresse de la personne 1
		AdressePostale adr3 = per1.getAdresse();
		
		
		
		
	}


	
}
