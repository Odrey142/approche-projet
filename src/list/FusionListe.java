package list;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> liste1 = new ArrayList<>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		
		List<String> liste2 = new ArrayList<>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		
		// Creer la liste 3
		List<String> liste3 = new ArrayList<>();
		
		//importer la liste 1 et 2 dans la liste 3
		
		for (int i =0; i<= liste1.size();i++) {
			liste3.add(liste1.get(i));
		}
		
		for (int i=0; i<= liste2.size();i++) {
			liste3.add(liste2.get(i));
		}
		
		//afficher liste 3
		
		for (int i = 0; i<= liste3.size();i++) {
			System.out.println(liste3.get(i));
		}
	}
	

}
