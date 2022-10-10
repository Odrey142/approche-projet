package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdressePostale adresse1 = new AdressePostale(); // j'ai créer une instance de classe
			adresse1.numeroDeRue = 2;
			adresse1.libelleDeRue = "boulevard general de gaulle";
			adresse1.codePostal = 44000;
			adresse1.ville = "Nantes";
			
		AdressePostale adresse2 = new AdressePostale();
			adresse2.numeroDeRue = 3;
			adresse2.libelleDeRue = "boulevard general de gaulle";
			adresse2.codePostal = 44300;
			adresse2.ville = "Nantes";
		

	}

}
