package fr.diginamic.banque.entities;

public class CompteTaux extends Compte{

		private String tauxRenum;
		
	public CompteTaux(int numeroCompte, int soldeCompte,String tauxRenum) {
		super(numeroCompte, soldeCompte);
		this.tauxRenum = tauxRenum;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + "CompteTaux [tauxRenum=" + tauxRenum + "]";
	}

	
	

}
