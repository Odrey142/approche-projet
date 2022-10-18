package list;

import java.util.ArrayList;

public class CreationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ArrayList<Integer> listNb = new ArrayList<>();
		
	//Ajout d'une boucle pour pouvoir rentrer tous les nombres
	//de 1 à 100 dans ma liste 
	for (int i=1; i<=100; i++) {
			listNb.add(i);
	}

	// Afficher la taille de ma liste:
	System.out.println(listNb.size());
	}

}
