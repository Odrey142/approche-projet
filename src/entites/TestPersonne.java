package entites;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adr1 = new AdressePostale(98,"cijd",33,"djhoi");
			
		Personne per1 = new Personne();
			
		
		Personne per2 = new Personne ("Gilbert","Don", new AdressePostale(97200,"fortdefrance",3,"martinique"));
		System.out.println(per2);
			
		per1.setNom("Léa");
		per1.setPrenom("marne");
		per1.setAdresse(adr1);
		
		
		String nom = per1.getNom();
		System.out.println(nom);
		
		
		AdressePostale adr3 = per1.getAdresse();
		
		
		
		
	}


	
}
