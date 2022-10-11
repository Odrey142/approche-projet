package fr.diginamic.banque.entities;

public class Compte {

		private int numeroCompte;
		private int soldeCompte;
		
	
		public Compte(int numeroCompte, int soldeCompte) {
			this.numeroCompte = numeroCompte;
			this.soldeCompte = soldeCompte;
		}


		@Override
		public String toString() {
			return "Compte [numeroCompte=" + numeroCompte + ", soldeCompte=" + soldeCompte + "]";
		}



		public int getNumeroCompte() {
			return numeroCompte;
		}

		public void setNumeroCompte(int numeroCompte) {
			this.numeroCompte = numeroCompte;
		}

		public int getSoldeCompte() {
			return soldeCompte;
		}

		public void setSoldeCompte(int soldeCompte) {
			this.soldeCompte = soldeCompte;
		}
		
		
		
		 
	
	}


