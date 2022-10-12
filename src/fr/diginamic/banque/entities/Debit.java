package fr.diginamic.banque.entities;

public class Debit extends Operation{

	public Debit(String dateOp, int montant) {
		super(dateOp, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}

	@Override
	public String toString() {
		return "Debit [getType()=" + getType() + "]";
	}

}
