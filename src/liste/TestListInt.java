package liste;

import java.util.ArrayList;

public class TestListInt {
 
	public static void main(String[] args) {
		ArrayList<Integer> ListeEntiers = new ArrayList<Integer>();
		ListeEntiers.add(-1);
		ListeEntiers.add(5);
		ListeEntiers.add(7);
		ListeEntiers.add(3);
		ListeEntiers.add(-2);
		ListeEntiers.add(4);
		ListeEntiers.add(8);
		ListeEntiers.add(5);
		
		
		for (int i = 0;i<=ListeEntiers.size();i++) {
			System.out.println(ListeEntiers.get(i));
		}
		
		System.out.println(ListeEntiers.size()+ "est la taille du tableau");
		
		//recuperer le maximun de la liste
		int max = ListeEntiers.get(0);
		for (int i = 0; i <= ListeEntiers.size();i++) {
			int Nbr = ListeEntiers.get(i);
			if (Nbr > max) {
				Nbr=max;
			}
		}
		
		//rechercher et supprimer le plus petit éléments de la liste
		int min = ListeEntiers.get(0);
		for (int a = 0;a<= ListeEntiers.size();a++) {
			int Nb = ListeEntiers.get(a);
			if(Nb < min) {
				min = Nb;
				int indexmin = a;	
				ListeEntiers.remove(indexmin);
			}
			
			for (int e =0;e<ListeEntiers.size();e++) {
				int nB = ListeEntiers.get(e);
				if (nB < 0) {
					System.out.println(ListeEntiers.set(e, -nB));
					//utilisation de setter pour modifier la négativité de nB
				}
			}
		}
	}
	
	
}
