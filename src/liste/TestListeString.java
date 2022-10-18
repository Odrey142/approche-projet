package liste;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
	
		ArrayList<String> Villes = new ArrayList<>();
		Villes.add("Nice");
		Villes.add("Carcasonne");
		Villes.add("Narbonne");
		Villes.add("Lyon");
		Villes.add("Foix");
		Villes.add("Pau");
		Villes.add("Marseille");
		Villes.add("Tarbes");
		
		System.out.println(Villes);
		
		
		int Motmax=0;
		String longeur = null;
		// = null car c'est une String et non un integer
		
		//boucle sur l'arraylist villes
		for (int i=0; i<=Villes.size(); i++) {
			String nomVille = Villes.get(i);
			
			if (nomVille.length() > Motmax) {
				}
				Motmax = nomVille.length();
				longeur = nomVille;
		
		System.out.println(nomVille);
	}

		//Mettre toute la liste de ville en majuscule
		for( int i = 0; i<=Villes.size();i++) {
			String nmVilles = Villes.get(i);
			Villes.set(i, nmVilles.toUpperCase());
			
			System.out.println(Villes);
			
		}
		
	
		
	}
	}
