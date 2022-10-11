package fr.diginamic.banque.entities;

public abstract class Operation {

	protected String dateOp;
	protected int montant;
	
	
	public Operation(String dateOp, int montant) {
		super();
		this.dateOp = dateOp;
		this.montant = montant;
	}
	
	
}
