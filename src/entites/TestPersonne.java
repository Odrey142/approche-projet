package entites;

import entities2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Personne per1 = new Personne();
			
		
		Personne per2 = new Personne ("Gilbert","Don", new AdressePostale(97200,"fortdefrance",3,"martinique"));
			
		System.out.println(per2);
			
	}


	
}
