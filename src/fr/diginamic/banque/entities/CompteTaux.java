package fr.diginamic.banque.entities;

public class CompteTaux extends Compte{

		private String tauxRenum;
		
	public CompteTaux(int numeroCompte, int soldeCompte,String tauxRenum) {
		super(numeroCompte, soldeCompte);
		this.tauxRenum = tauxRenum;
		
	}

	@Override
	public String toString() {
		return super.toString() + "CompteTaux [tauxRenum=" + tauxRenum + "]";
	}

	
	public String getTauxRenum() {
		return tauxRenum;
	}

	public void setTauxRenum(String tauxRenum) {
		this.tauxRenum = tauxRenum;
	}

	
	

}
