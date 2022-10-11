package fr.diginamic.banque.entities;

public abstract class Operation {

	protected String dateOp;
	protected int montant;
	
	
	public Operation(String dateOp, int montant) {
		super();
		this.dateOp = dateOp;
		this.montant = montant;
	}


	public String getDateOp() {
		return dateOp;
	}


	public void setDateOp(String dateOp) {
		this.dateOp = dateOp;
	}


	public int getMontant() {
		return montant;
	}


	public void setMontant(int montant) {
		this.montant = montant;
	}
	
	
}
