package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
	
		
		AdressePostale adresse1 = new AdressePostale(2,"boulevard general de gaulle",44000,"Nantes"); // j'ai créer une instance de classe
			
			
		AdressePostale adresse2 = new AdressePostale(3,"boulevard general de gaulle",44300,"Nantes");
		
		System.out.println(adresse1.numeroDeRue);

		
		// la je modifie le code postale de l'adresse 1
		adresse1.setCodePostal(3000);
		adresse1.setLibelleDeRue("pays du vent");
		
		System.out.println(adresse1);
		
	}

}
